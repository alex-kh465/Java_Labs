// Define the interface
interface WaterConservationSystem {
    int calculateTrappedWater(int[] blockHeights);
}

// Abstract class implementing the interface
abstract class RainySeasonConservation implements WaterConservationSystem {
    @Override
    public abstract int calculateTrappedWater(int[] blockHeights);
}

// Concrete class extending the abstract class
class CityBlockConservation extends RainySeasonConservation {
    @Override
    public int calculateTrappedWater(int[] blockHeights) {
        int n = blockHeights.length;
        if (n == 0) return 0;

        // Arrays to store the maximum height from left and right
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = blockHeights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], blockHeights[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = blockHeights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], blockHeights[i]);
        }

        // Calculate the trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - blockHeights[i];
        }

        return totalWater;
    }
}

// Main class to test the implementation
public class water {
    public static void main(String[] args) {
        CityBlockConservation conservationSystem = new CityBlockConservation();
        int[] blockHeights = {3, 0, 0, 2, 0, 4};
        int trappedWater = conservationSystem.calculateTrappedWater(blockHeights);
        
        System.out.println("Total water trapped: " + trappedWater);
    }
}
