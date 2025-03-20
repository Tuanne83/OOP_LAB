import numpy as np

def cal(x, idx):
    mul = 1.0
    for i in range(n):
        if i == idx: continue
        mul = mul*(x[idx]-x[i])
    return mul
n = int(input("Input length n of vector: "))
x = list(map(int, input("Input vector x: ").split()))
f = list(map(int, input("Input vector f: ").split()))
a = []
p = np.poly1d(0)
for i in range(n):
    e = f[i]/cal(x, i)
    print(e)
    c = [xi for xi in x]
    c.pop(i)
    p += np.poly1d(c, True)*np.poly1d(e)
print(p)
11:35
Minh đã chuyển tiếp một tin nhắn
Hoàng Minh
import numpy as np
import matplotlib.pyplot as plt
from scipy.interpolate import CubicSpline
from sympy import symbols, expand

def spline_interpolation(x_values, y_values):
    """Hàm xây dựng nội suy Spline bậc 3 và xuất các đa thức"""
    cs = CubicSpline(x_values, y_values, bc_type='natural')
    x = symbols('x')
    splines = []
    for i in range(len(x_values) - 1):
        a, b, c, d = cs.c[:, i]  # Lấy hệ số của đoạn i
        spline_poly = expand(a * (x - x_values[i])**3 + b * (x - x_values[i])**2 + c * (x - x_values[i]) + d)
        splines.append(f"S{i}(x) = {spline_poly}  với {x_values[i]} ≤ x ≤ {x_values[i+1]}")
    
    return cs, splines

def plot_spline(x_values, y_values, cs):
    """Hàm vẽ đồ thị của nội suy Spline"""
    x_plot = np.linspace(min(x_values), max(x_values), 400)
    y_plot = cs(x_plot)

    plt.figure(figsize=(8, 6))
    plt.plot(x_plot, y_plot, label="Nội suy Spline", color='b')
    plt.scatter(x_values, y_values, color='r', marker='o', label="Điểm dữ liệu")
    plt.xlabel("x")
    plt.ylabel("S(x)")
    plt.title("Đồ thị nội suy Spline bậc 3")
    plt.legend()
    plt.grid(True)
    plt.show()

x_values = list(map(float, input("Nhập vector x (cách nhau bởi khoảng trắng): ").split()))
y_values = list(map(float, input("Nhập vector y (cách nhau bởi khoảng trắng): ").split()))

# Kiểm tra độ dài vector
if len(x_values) != len(y_values):
    print("Lỗi: Số phần tử của vector x và y phải bằng nhau!")
elif len(x_values) < 3:
    print("Lỗi: Nội suy Spline cần ít nhất 3 điểm!")
else:
    # Tính spline
    cs, splines = spline_interpolation(x_values, y_values)

    # Xuất kết quả
    print("Các đa thức nội suy Spline bậc 3:")
    for s in splines:
        print(s)

    # Vẽ đồ thị
    plot_spline(x_values, y_values, cs)