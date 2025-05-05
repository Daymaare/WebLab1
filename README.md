# daymaare/sorteringsapp

A Java application for sorting numbers using different algorithms (e.g., BubbleSort, QuickSort).

---

## 🚀 How to Run Interactively

Run the container with an interactive terminal to enter input manually:

```sh
docker run -it daymaare/sorteringsapp
```

You will be prompted to:
- Enter the size of the array
- Enter the numbers to sort (one per line)
- Choose a sorting algorithm (from the menu)

---

## 🤖 How to Run with Automated Input

A sample `input.txt` file is included in this repository for your convenience.

**To use the app with automated/scripted input:**

1. Make sure `input.txt` is present (see below for its contents).
2. Run the container with input redirected from the file:

    ```sh
    docker run -i daymaare/sorteringsapp < input.txt
    ```

---

## 📄 Sample input.txt

The included `input.txt` contains:

```
10
100
23
3
44
56
1
45
2
34
263
1
```

- `10` is the array size
- `100 23 3 44 56 1 45 2 34 263` are the numbers to sort (one per line)
- `1` is the sorting algorithm choice (e.g., 1 for BubbleSort, 2 for QuickSort)

---

## 📝 Expected Input Format

1. **Array size** (e.g., `5`)
2. **Numbers to sort** (one per line)
3. **Sorting algorithm choice** (number from the menu)

---

**Enjoy sorting!**