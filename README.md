tripv
=====

a language

Design a language that creates a static HTML document.
•  Use an intermediary language as a compiler.
•	Develop a grammar specifying start set, terminals, non-terminals, and grammar production rules.
•	Make the language modular for future expansions.
•	Name the language Trip V.

Terminals:
Put, Make, Format, Blue, RGB, Red, Green, Blue, Black, White, Yellow, Purple, Orange, Pink, Brown, Grey, Light, Dark, Italic, Bold, Underline, Center, Left, Right, Insert, Picture, Link, Table, List, Bullet, Numbered, Paragraph, Top, Bottom, Middle, Title, Size, Insert.

Non-Terminals:
Function, Element, Color, Format, Alignment, Constant, Number, LocationOnPC, TextField, Statement, Style, Tint.

 Production Rules:
Statement :==  {Function} 
Function :== {Function  Element Alignment} || {Function Element Format Alignment} 
Element :== {TextField} || {Image} || {Link} || {Table} || {List}
Image :== {Image LocationOnPC}
Format :== {Style} || {Color} || {Color Tint}
Color :==  {Red} || {Blue} || {Green} || {Black} || {White} || {Yellow} || {Purple} ||    {Orange} || {Pink} || {Brown} || {Grey}
Style :== {Style Style}
Style :== {Underline} || {Bold} || {Italic} 
Tint :== {Light} || {Dark}
Alignment :== {Horizontal Vertical}
Horizontal :== {Left} || {Right} || {Center}
Vertical :== {Top} || {Middle} || {Bottom}
