import numpy as np

def histogram_equalization(img):
    # Step 1: Compute histogram and probabilities
    unique, counts = np.unique(img, return_counts=True)
    hist = dict(zip(unique, counts))
    total_pixels = img.size
    pI = {k: v / total_pixels for k, v in hist.items()}  # Probability distribution
    print("Step 1: Histogram and Probability Distribution")
    print("Histogram:", hist)
    print("Probability Distribution:", pI)
    
    # Step 2: Compute cumulative distribution function (CDF)
    T = {}
    cumulative_sum = 0
    for k in sorted(pI.keys()):
        cumulative_sum += pI[k]
        T[k] = cumulative_sum
    print("\nStep 2: Cumulative Distribution Function (CDF)")
    print("CDF:", T)
    
    # Step 3: Normalize CDF to the range [0, L] and round
    L = max(img.flatten())
    S = {k: round(T[k] * L) for k in T}
    print("\nStep 3: Normalized CDF and Mapping")
    print("Mapping Function:", S)
    
    # Step 4: Map pixel values to equalized values
    img_equalized = np.vectorize(S.get)(img)
    print("\nStep 4: Equalized Image")
    print(img_equalized)
    
    return img_equalized

# Example usage
image = np.array([[3, 3, 4], [2, 3, 5], [1, 0, 6]], dtype=np.uint8)
equalized_image = histogram_equalization(image)