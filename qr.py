# generate a qrcode from an input
# Sample comment here

import qrcode
import cv2 as cv
import sys
from PIL import Image

words = input("Please type any words to be an qrcode: ")
img = qrcode.make(words)

words = input("Write the name of the file: ")
img.save(f"{words}.png", "PNG")

img = cv.imread(f"{words}.png",1)
if img is None:
    sys.exit(f"Could not read {words}.png")
cv.imshow("QRCODE", img)
k = cv.waitKey(0)
if k == ord("s"):
    cv.imwrite("QRCODE", img)
print("End of the code")
