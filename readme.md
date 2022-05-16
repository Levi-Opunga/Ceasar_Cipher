# Caesar Cipher App
This a simple java application ths uses classes to implement the functionality of encoding and decoding a Caesar Cipher.

## Prerequisites
- Knowledge of On Git CLI
- Java 11
- Gradle as a built tool
- IntelliJ or any Java based IDE

## Technologies
- Java 11
- Gradle

## Installation
1. Clone or download repository as an archive
2. If archive unzip the archive to get project folder
3. Open the folder in a Java ide of your choice (e.g. IntelliJ) and execute `App.java` class with gradle
4. Enter the prompt in the gradle run pane to see how the application works
## Note
5. ### Sometimes due to gradle messages result may be pushed up pane so expand run pane or scroll up accordingly to see the result 
6. ### The shift key you  use to encrypt is the same as the shift key you use for decryption.

### Sample encryption prompt dialog
 ```
 Which of the following would you like to do?
=======================================================================================================
1 Encrypt message
2 Decrypt message
=======================================================================================================
Pick the option using the number
1
Enter the key shift you want to use:
3
=======================================================================================================
Enter the string you want to encrypt:
ABCDEFGHIJKL
=======================================================================================================
Your original message: ABCDEFGHIJKL
Your encrypted message: XYZABCDEFGHI
=======================================================================================================

```
### Sample Decryption prompt dialog
```
Which of the following would you like to do?
=======================================================================================================
1 Encrypt message
2 Decrypt message
=======================================================================================================
Pick the option using the number
2
Enter the key shift you want to use to decrypt:
3
=======================================================================================================
Enter the string you want to decrypt:
XYZABCDEFGHI
=======================================================================================================
The Encrypted message was: XYZABCDEFGHI
Your Decrypted message: ABCDEFGHIJKL
=======================================================================================================

```
> ###  If you enter an invalid selection you will get an error and be re-prompted to enter fields  
- example:
 ```
 Which of the following would you like to do?
=======================================================================================================
1 Encrypt message
2 Decrypt message
=======================================================================================================
Pick the option using the number
3
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
INVALID CHOICE RERUNNING APPLICATION
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
App has been RESTARTED please select a valid option 1 or 2
=======================================================================================================
1 Encrypt message
2 Decrypt message
=======================================================================================================
Pick the option using the number
1
Enter the key shift you want to use:
3
=======================================================================================================
Enter the string you want to encrypt:
abcdefgh
=======================================================================================================
Your original message: ABCDEFGH
Your encrypted message: XYZABCDE
=======================================================================================================
```

## To Contribute or Fix bug
To fix a bug or enhance an existing module, follow these steps:

- Fork the repo
- Create a new branch (`git checkout -b improve-feature`)
- Make the appropriate changes in the files
- Add changes to reflect the changes made
- Commit your changes (`git commit -am 'Improve feature'`)
- Push to the branch (`git push origin improve-feature`)
- Create a Pull Request

## BUGS FOUND

If you come across any bug in the project kindly report using the link below
#### [Link 🔗 ](https://github.com/Levi-Opunga/Ceasar_Cipher/issues/new)

## Licence
### MIT License
>Copyright (c) 2022 Levi Opunga

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

## Support and contact details

> > EMAIL: leviopunga@gmail.com



