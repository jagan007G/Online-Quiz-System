from tkinter import *
from tkinter import filedialog
from tkinter.filedialog import askopenfilename
import tkinter as tk
from PIL import Image,ImageTk
import os
import stegano
from stegano import lsb
import PIL.Image

master=Tk()
master.title("steganography")
master.geometry("700x500+150+800")
master.resizable(False,False)
master.configure(bg="#2f4155")
#master.iconphoto(False,img)


 
def showimage():
    global filename
    filetype=(("PNG file","*.png"),
    ("JPG file","*.jpg"),
    ("ALL file","."))
    filename=filedialog.askopenfilename(initialdir=os.getcwd(),
                                        title='Select Image File',
                                        filetypes= filetype)
    img1=PIL.Image.open(filename)
    img=PIL.ImageTk.PhotoImage(img1)
    #lbl.configure(image=img,width=250,height=250)
    lbl.configure(image=img,width=250,height=250)
    lbl.image=img
    
    

def Hide():
    global secret
    message=text1.get(1.0,END)
    secret = lsb.hide(str(filename),message)
   

def Show():
    clear_message = lsb.reveal(filename)
    text1.delete(1.0,END)
    text1.insert(END,clear_message)

def save():
    secret.save("hello.png")






#icon
#image_icon=PhotoImage(file="")
#master.iconphoto(False,image_icon)

#logo
logo=PhotoImage(file="")
Label(master,image=logo,bg="#2f4155").place(x=10,y=0)

Label(master,text="stego",bg="#2d4155",fg="white",font="arial 25 bold").place(x=200,y=200)

#first
f=Frame(master,bd=3,bg="black",width=340,height=280,relief=GROOVE)
f.place(x=10,y=80) 
lbl=Label(f,bg="black")
lbl.place(x=40,y=10)


#second
frame2=Frame(master,bd=3,width=340,height=280,bg="white",relief=GROOVE)
frame2.place(x=350,y=80)
text1=Text(frame2,font="Roboto 20",bg="white",fg="black",relief=GROOVE,wrap=WORD)
text1.place(x=0,y=0,width=320,height=295)

scrollbar1=Scrollbar(frame2)
scrollbar1.place(x=320,y=0,height=300)

scrollbar1.configure(command=text1.yview)
text1.configure(yscrollcommand=scrollbar1.set)

#third
frame3=Frame(master,bd=3,bg="#2f4155",width=330,height=100,relief=GROOVE)
frame3.place(x=10,y=370)

Button(frame3,text="OPEN IMAGE",width=10,height=2,font="arial 14 bold",command=showimage).place(x=20,y=30)
Button(frame3,text="SAVE IMAGE",width=10,height=2,font="arial 14 bold",command=save).place(x=180,y=30)
Label(frame3,text="Picture,image,photo file",bg="#2f4155",fg="yellow").place(x=20,y=5)

#fourth
frame4=Frame(master,bd=3,bg="#2f4155",width=330,height=100,relief=RAISED)
frame4.place(x=360,y=370)

Button(frame4,text="HIDE DATA",width=10,height=2,font="arial 14 bold",command=Hide).place(x=20,y=30)
Button(frame4,text="SHOW DATA",width=10,height=2,font="arial 14 bold",command=Show).place(x=180,y=30)
Label(frame4,text="Picture image,photo file",bg="#2f4155",fg="yellow").place(x=20,y=5)

master.mainloop()
