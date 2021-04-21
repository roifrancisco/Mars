# generate a qrcode from an input

# Sample comment here
import qrcode. 
from PIL import Image

words = input("Please type any words to be an qrcode: ")
img = qrcode.make(words)

words = input("Write the name of the file:")
img.save(f"{words}.png", "PNG")