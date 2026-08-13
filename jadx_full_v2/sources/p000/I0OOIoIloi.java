            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
/* 10 */    public final class I0OOIoIloi extends I00i01iIIliI {
                public final int I0000Il00O = 1;

                public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, byte b, short s) {
/* 8 */             super(1, O0i1I1i.class);
                }

                @Override
                public final I01Iio10lo I00000oOI(I01Iio10lo i01Iio10lo) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 828 */                   I0OO1o1ooI i0OO1o1ooI = (I0OO1o1ooI) i01Iio10lo;
/* 830 */                   I0OO0l i0OO0lI001lllioOl = I0OO0l00IIO.I001lllioOl();
/* 834 */                   i0OO0lI001lllioOl.I0000oI00();
/* 841 */                   ((I0OO0l00IIO) i0OO0lI001lllioOl.I00iiI).I00IO1();
/* 848 */                   byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(i0OO1o1ooI.I001iOo1i0O());
/* 853 */                   IIO1i10I iIO1i10II0000oI00 = IIOI1Ii1I.I0000oI00(bArrI00000oIO, 0, bArrI00000oIO.length);
/* 857 */                   i0OO0lI001lllioOl.I0000oI00();
/* 864 */                   ((I0OO0l00IIO) i0OO0lI001lllioOl.I00iiI).I00II0Ol1O0l(iIO1i10II0000oI00);
/* 867 */                   I0OOl1o0oO i0OOl1o0oOI001l0I00 = i0OO1o1ooI.I001l0I00();
/* 871 */                   i0OO0lI001lllioOl.I0000oI00();
/* 878 */                   ((I0OO0l00IIO) i0OO0lI001lllioOl.I00iiI).I00II0oii1o(i0OOl1o0oOI001l0I00);
/* 885 */                   return (I0OO0l00IIO) i0OO0lI001lllioOl.I00000oOI();
                        case 1:
/* 597 */                   I0Oi0IiliOi i0Oi0IiliOi = (I0Oi0IiliOi) i01Iio10lo;
/* 607 */                   I0OO1oilIOl[] i0OO1oilIOlArr = {new I0OO1oilIOl(3, I0OillIOOOIl.class)};
/* 613 */                   HashMap map = new HashMap();
/* 618 */                   for (I0OO1oilIOl i0OO1oilIOl : i0OO1oilIOlArr) {
/* 624 */                       boolean zContainsKey = map.containsKey(i0OO1oilIOl.I00000oIO);
/* 628 */                       Class cls = i0OO1oilIOl.I00000oIO;
/* 630 */                       if (zContainsKey) {
/* 644 */                           IoOOl0iOl1io.I001l0I00("KeyTypeManager constructed with duplicate factories for primitive ", cls.getCanonicalName());
/* 647 */                           return null;
                                }
/* 632 */                       map.put(cls, i0OO1oilIOl);
                            }
/* 651 */                   if (i0OO1oilIOlArr.length > 0) {
/* 655 */                       Class cls2 = i0OO1oilIOlArr[0].I00000oIO;
                            }
/* 657 */                   Collections.unmodifiableMap(map);
/* 660 */                   I0Ol0ll0Il i0Ol0ll0IlI001iOo1i0O = i0Oi0IiliOi.I001iOo1i0O();
/* 664 */                   I0Oio0l i0Oio0lI001lloI = I0Oioo0l0oO.I001lloI();
/* 668 */                   I0OlI00 i0OlI00I001lIiIIo1O = i0Ol0ll0IlI001iOo1i0O.I001lIiIIo1O();
/* 672 */                   i0Oio0lI001lloI.I0000oI00();
/* 679 */                   ((I0Oioo0l0oO) i0Oio0lI001lloI.I00iiI).I00IO1(i0OlI00I001lIiIIo1O);
/* 686 */                   byte[] bArrI00000oIO2 = OOl1iO0l.I00000oIO(i0Ol0ll0IlI001iOo1i0O.I001l0I00());
/* 691 */                   IIO1i10I iIO1i10II0000oI002 = IIOI1Ii1I.I0000oI00(bArrI00000oIO2, 0, bArrI00000oIO2.length);
/* 695 */                   i0Oio0lI001lloI.I0000oI00();
/* 702 */                   ((I0Oioo0l0oO) i0Oio0lI001lloI.I00iiI).I00II0oii1o(iIO1i10II0000oI002);
/* 705 */                   i0Oio0lI001lloI.I0000oI00();
/* 712 */                   ((I0Oioo0l0oO) i0Oio0lI001lloI.I00iiI).I00IO1oi11O();
/* 719 */                   I0Oioo0l0oO i0Oioo0l0oO = (I0Oioo0l0oO) i0Oio0lI001lloI.I00000oOI();
/* 723 */                   new Io1lOiII0();
/* 726 */                   Io1lOi io1lOiI001l0I00 = i0Oi0IiliOi.I001l0I00();
/* 730 */                   Io1l0o io1l0oI001lloI = Io1lI0.I001lloI();
/* 734 */                   io1l0oI001lloI.I0000oI00();
/* 741 */                   ((Io1lI0) io1l0oI001lloI.I00iiI).I00IO1oi11O();
/* 744 */                   Io1lilII0O1 io1lilII0O1I001lIiIIo1O = io1lOiI001l0I00.I001lIiIIo1O();
/* 748 */                   io1l0oI001lloI.I0000oI00();
/* 755 */                   ((Io1lI0) io1l0oI001lloI.I00iiI).I00IO1(io1lilII0O1I001lIiIIo1O);
/* 762 */                   byte[] bArrI00000oIO3 = OOl1iO0l.I00000oIO(io1lOiI001l0I00.I001l0I00());
/* 767 */                   IIO1i10I iIO1i10II0000oI003 = IIOI1Ii1I.I0000oI00(bArrI00000oIO3, 0, bArrI00000oIO3.length);
/* 771 */                   io1l0oI001lloI.I0000oI00();
/* 778 */                   ((Io1lI0) io1l0oI001lloI.I00iiI).I00II0oii1o(iIO1i10II0000oI003);
/* 785 */                   Io1lI0 io1lI0 = (Io1lI0) io1l0oI001lloI.I00000oOI();
/* 787 */                   I0OOoIi i0OOoIiI001lllioOl = I0OOoOII1Io.I001lllioOl();
/* 791 */                   i0OOoIiI001lllioOl.I0000oI00();
/* 798 */                   ((I0OOoOII1Io) i0OOoIiI001lllioOl.I00iiI).I00II0Ol1O0l(i0Oioo0l0oO);
/* 801 */                   i0OOoIiI001lllioOl.I0000oI00();
/* 808 */                   ((I0OOoOII1Io) i0OOoIiI001lllioOl.I00iiI).I00II0oii1o(io1lI0);
/* 811 */                   i0OOoIiI001lllioOl.I0000oI00();
/* 818 */                   ((I0OOoOII1Io) i0OOoIiI001lllioOl.I00iiI).I00IO1();
/* 825 */                   return (I0OOoOII1Io) i0OOoIiI001lllioOl.I00000oOI();
                        case 2:
/* 537 */                   I0OiIllIIO00 i0OiIllIIO00 = (I0OiIllIIO00) i01Iio10lo;
/* 539 */                   I0OiI1iII i0OiI1iIII001lllioOl = I0OiIlIl.I001lllioOl();
/* 547 */                   byte[] bArrI00000oIO4 = OOl1iO0l.I00000oIO(i0OiIllIIO00.I001iOo1i0O());
/* 552 */                   IIO1i10I iIO1i10II0000oI004 = IIOI1Ii1I.I0000oI00(bArrI00000oIO4, 0, bArrI00000oIO4.length);
/* 556 */                   i0OiI1iIII001lllioOl.I0000oI00();
/* 563 */                   ((I0OiIlIl) i0OiI1iIII001lllioOl.I00iiI).I00II0Ol1O0l(iIO1i10II0000oI004);
/* 566 */                   I0OiiOoi i0OiiOoiI001l0I00 = i0OiIllIIO00.I001l0I00();
/* 570 */                   i0OiI1iIII001lllioOl.I0000oI00();
/* 577 */                   ((I0OiIlIl) i0OiI1iIII001lllioOl.I00iiI).I00II0oii1o(i0OiiOoiI001l0I00);
/* 580 */                   i0OiI1iIII001lllioOl.I0000oI00();
/* 587 */                   ((I0OiIlIl) i0OiI1iIII001lllioOl.I00iiI).I00IO1();
/* 594 */                   return (I0OiIlIl) i0OiI1iIII001lllioOl.I00000oOI();
                        case 3:
/* 477 */                   I0Ol0ll0Il i0Ol0ll0Il = (I0Ol0ll0Il) i01Iio10lo;
/* 479 */                   I0Oio0l i0Oio0lI001lloI2 = I0Oioo0l0oO.I001lloI();
/* 483 */                   I0OlI00 i0OlI00I001lIiIIo1O2 = i0Ol0ll0Il.I001lIiIIo1O();
/* 487 */                   i0Oio0lI001lloI2.I0000oI00();
/* 494 */                   ((I0Oioo0l0oO) i0Oio0lI001lloI2.I00iiI).I00IO1(i0OlI00I001lIiIIo1O2);
/* 501 */                   byte[] bArrI00000oIO5 = OOl1iO0l.I00000oIO(i0Ol0ll0Il.I001l0I00());
/* 506 */                   IIO1i10I iIO1i10II0000oI005 = IIOI1Ii1I.I0000oI00(bArrI00000oIO5, 0, bArrI00000oIO5.length);
/* 510 */                   i0Oio0lI001lloI2.I0000oI00();
/* 517 */                   ((I0Oioo0l0oO) i0Oio0lI001lloI2.I00iiI).I00II0oii1o(iIO1i10II0000oI005);
/* 520 */                   i0Oio0lI001lloI2.I0000oI00();
/* 527 */                   ((I0Oioo0l0oO) i0Oio0lI001lloI2.I00iiI).I00IO1oi11O();
/* 534 */                   return (I0Oioo0l0oO) i0Oio0lI001lloI2.I00000oOI();
                        case 4:
/* 417 */                   I0OllI1Ol i0OllI1Ol = (I0OllI1Ol) i01Iio10lo;
/* 419 */                   I0OlOiIO i0OlOiIOI001lllioOl = I0OlOl.I001lllioOl();
/* 427 */                   byte[] bArrI00000oIO6 = OOl1iO0l.I00000oIO(i0OllI1Ol.I001iOo1i0O());
/* 432 */                   IIO1i10I iIO1i10II0000oI006 = IIOI1Ii1I.I0000oI00(bArrI00000oIO6, 0, bArrI00000oIO6.length);
/* 436 */                   i0OlOiIOI001lllioOl.I0000oI00();
/* 443 */                   ((I0OlOl) i0OlOiIOI001lllioOl.I00iiI).I00II0Ol1O0l(iIO1i10II0000oI006);
/* 446 */                   I0Ollli1 i0Ollli1I001l0I00 = i0OllI1Ol.I001l0I00();
/* 450 */                   i0OlOiIOI001lllioOl.I0000oI00();
/* 457 */                   ((I0OlOl) i0OlOiIOI001lllioOl.I00iiI).I00II0oii1o(i0Ollli1I001l0I00);
/* 460 */                   i0OlOiIOI001lllioOl.I0000oI00();
/* 467 */                   ((I0OlOl) i0OlOiIOI001lllioOl.I00iiI).I00IO1();
/* 474 */                   return (I0OlOl) i0OlOiIOI001lllioOl.I00000oOI();
                        case 5:
/* 357 */                   I0OoIoIilio i0OoIoIilio = (I0OoIoIilio) i01Iio10lo;
/* 359 */                   I0OoI11loll i0OoI11lollI001lllioOl = I0OoI1oo101.I001lllioOl();
/* 367 */                   byte[] bArrI00000oIO7 = OOl1iO0l.I00000oIO(i0OoIoIilio.I001iOo1i0O());
/* 372 */                   IIO1i10I iIO1i10II0000oI007 = IIOI1Ii1I.I0000oI00(bArrI00000oIO7, 0, bArrI00000oIO7.length);
/* 376 */                   i0OoI11lollI001lllioOl.I0000oI00();
/* 383 */                   ((I0OoI1oo101) i0OoI11lollI001lllioOl.I00iiI).I00II0Ol1O0l(iIO1i10II0000oI007);
/* 386 */                   I0OoOO i0OoOOI001l0I00 = i0OoIoIilio.I001l0I00();
/* 390 */                   i0OoI11lollI001lllioOl.I0000oI00();
/* 397 */                   ((I0OoI1oo101) i0OoI11lollI001lllioOl.I00iiI).I00II0oii1o(i0OoOOI001l0I00);
/* 400 */                   i0OoI11lollI001lllioOl.I0000oI00();
/* 407 */                   ((I0OoI1oo101) i0OoI11lollI001lllioOl.I00iiI).I00IO1();
/* 414 */                   return (I0OoI1oo101) i0OoI11lollI001lllioOl.I00000oOI();
                        case 6:
/* 313 */                   I0Ool0l1oOO0 i0Ool0l1oOO0I001lIiIIo1O = I0Ool0oO1io.I001lIiIIo1O();
/* 321 */                   byte[] bArrI00000oIO8 = OOl1iO0l.I00000oIO(((I0Ooo0oloo1) i01Iio10lo).I001iOo1i0O());
/* 326 */                   IIO1i10I iIO1i10II0000oI008 = IIOI1Ii1I.I0000oI00(bArrI00000oIO8, 0, bArrI00000oIO8.length);
/* 330 */                   i0Ool0l1oOO0I001lIiIIo1O.I0000oI00();
/* 337 */                   ((I0Ool0oO1io) i0Ool0l1oOO0I001lIiIIo1O.I00iiI).I001lloI(iIO1i10II0000oI008);
/* 340 */                   i0Ool0l1oOO0I001lIiIIo1O.I0000oI00();
/* 347 */                   ((I0Ool0oO1io) i0Ool0l1oOO0I001lIiIIo1O.I00iiI).I00II0Ol1O0l();
/* 354 */                   return (I0Ool0oO1io) i0Ool0l1oOO0I001lIiIIo1O.I00000oOI();
                        case 7:
/* 267 */                   I0i0I00O i0i0I00OI001lIiIIo1O = I0i0IOiOiO.I001lIiIIo1O();
/* 275 */                   byte[] bArrI00000oIO9 = OOl1iO0l.I00000oIO(((I0i0ill11) i01Iio10lo).I001iOo1i0O());
/* 280 */                   IIO1i10I iIO1i10II0000oI009 = IIOI1Ii1I.I0000oI00(bArrI00000oIO9, 0, bArrI00000oIO9.length);
/* 284 */                   i0i0I00OI001lIiIIo1O.I0000oI00();
/* 291 */                   ((I0i0IOiOiO) i0i0I00OI001lIiIIo1O.I00iiI).I001lloI(iIO1i10II0000oI009);
/* 294 */                   i0i0I00OI001lIiIIo1O.I0000oI00();
/* 301 */                   ((I0i0IOiOiO) i0i0I00OI001lIiIIo1O.I00iiI).I00II0Ol1O0l();
/* 308 */                   return (I0i0IOiOiO) i0i0I00OI001lIiIIo1O.I00000oOI();
                        case 8:
/* 221 */                   I0i0lo00IiO i0i0lo00IiOI001lIiIIo1O = I0i0loloI.I001lIiIIo1O();
/* 229 */                   byte[] bArrI00000oIO10 = OOl1iO0l.I00000oIO(((I0i10O1iiio) i01Iio10lo).I001iOo1i0O());
/* 234 */                   IIO1i10I iIO1i10II0000oI0010 = IIOI1Ii1I.I0000oI00(bArrI00000oIO10, 0, bArrI00000oIO10.length);
/* 238 */                   i0i0lo00IiOI001lIiIIo1O.I0000oI00();
/* 245 */                   ((I0i0loloI) i0i0lo00IiOI001lIiIIo1O.I00iiI).I001lloI(iIO1i10II0000oI0010);
/* 248 */                   i0i0lo00IiOI001lIiIIo1O.I0000oI00();
/* 255 */                   ((I0i0loloI) i0i0lo00IiOI001lIiIIo1O.I00iiI).I00II0Ol1O0l();
/* 262 */                   return (I0i0loloI) i0i0lo00IiOI001lIiIIo1O.I00000oOI();
                        case 9:
/* 179 */                   IO0lo11ol iO0lo11olI001lIiIIo1O = IO0loooo0O0.I001lIiIIo1O();
/* 183 */                   iO0lo11olI001lIiIIo1O.I0000oI00();
/* 190 */                   ((IO0loooo0O0) iO0lo11olI001lIiIIo1O.I00iiI).I00II0Ol1O0l();
/* 193 */                   byte[] bArrI00000oIO11 = OOl1iO0l.I00000oIO(32);
/* 198 */                   IIO1i10I iIO1i10II0000oI0011 = IIOI1Ii1I.I0000oI00(bArrI00000oIO11, 0, bArrI00000oIO11.length);
/* 202 */                   iO0lo11olI001lIiIIo1O.I0000oI00();
/* 209 */                   ((IO0loooo0O0) iO0lo11olI001lIiIIo1O.I00iiI).I001lloI(iIO1i10II0000oI0011);
/* 216 */                   return (IO0loooo0O0) iO0lo11olI001lIiIIo1O.I00000oOI();
                        case 10:
/* 117 */                   Io1lOi io1lOi = (Io1lOi) i01Iio10lo;
/* 119 */                   Io1l0o io1l0oI001lloI2 = Io1lI0.I001lloI();
/* 123 */                   io1l0oI001lloI2.I0000oI00();
/* 130 */                   ((Io1lI0) io1l0oI001lloI2.I00iiI).I00IO1oi11O();
/* 133 */                   Io1lilII0O1 io1lilII0O1I001lIiIIo1O2 = io1lOi.I001lIiIIo1O();
/* 137 */                   io1l0oI001lloI2.I0000oI00();
/* 144 */                   ((Io1lI0) io1l0oI001lloI2.I00iiI).I00IO1(io1lilII0O1I001lIiIIo1O2);
/* 151 */                   byte[] bArrI00000oIO12 = OOl1iO0l.I00000oIO(io1lOi.I001l0I00());
/* 156 */                   IIO1i10I iIO1i10II0000oI0012 = IIOI1Ii1I.I0000oI00(bArrI00000oIO12, 0, bArrI00000oIO12.length);
/* 160 */                   io1l0oI001lloI2.I0000oI00();
/* 167 */                   ((Io1lI0) io1l0oI001lloI2.I00iiI).I00II0oii1o(iIO1i10II0000oI0012);
/* 174 */                   return (Io1lI0) io1l0oI001lloI2.I00000oOI();
                        case 11:
/* 86 */                    O0i11ilIi10l o0i11ilIi10lI001lIiIIo1O = O0i11lIO1lO0.I001lIiIIo1O();
/* 90 */                    o0i11ilIi10lI001lIiIIo1O.I0000oI00();
/* 97 */                    ((O0i11lIO1lO0) o0i11ilIi10lI001lIiIIo1O.I00iiI).I001lloI((O0i1I1i) i01Iio10lo);
/* 100 */                   o0i11ilIi10lI001lIiIIo1O.I0000oI00();
/* 107 */                   ((O0i11lIO1lO0) o0i11ilIi10lI001lIiIIo1O.I00iiI).I00II0Ol1O0l();
/* 114 */                   return (O0i11lIO1lO0) o0i11ilIi10lI001lIiIIo1O.I00000oOI();
                        case 12:
/* 53 */                    O0i1O10 o0i1O10I001lIiIIo1O = O0i1OI.I001lIiIIo1O();
/* 57 */                    o0i1O10I001lIiIIo1O.I0000oI00();
/* 64 */                    ((O0i1OI) o0i1O10I001lIiIIo1O.I00iiI).I001lloI((O0i1OoIO) i01Iio10lo);
/* 67 */                    o0i1O10I001lIiIIo1O.I0000oI00();
/* 74 */                    ((O0i1OI) o0i1O10I001lIiIIo1O.I00iiI).I00II0Ol1O0l();
/* 81 */                    return (O0i1OI) o0i1O10I001lIiIIo1O.I00000oOI();
                        default:
/* 11 */                    i01loI i01loiI001lIiIIo1O = i01lolol.I001lIiIIo1O();
/* 15 */                    i01loiI001lIiIIo1O.I0000oI00();
/* 22 */                    ((i01lolol) i01loiI001lIiIIo1O.I00iiI).I00II0Ol1O0l();
/* 25 */                    byte[] bArrI00000oIO13 = OOl1iO0l.I00000oIO(32);
/* 30 */                    IIO1i10I iIO1i10II0000oI0013 = IIOI1Ii1I.I0000oI00(bArrI00000oIO13, 0, bArrI00000oIO13.length);
/* 34 */                    i01loiI001lIiIIo1O.I0000oI00();
/* 41 */                    ((i01lolol) i01loiI001lIiIIo1O.I00iiI).I001lloI(iIO1i10II0000oI0013);
/* 48 */                    return (i01lolol) i01loiI001lIiIIo1O.I00000oOI();
                    }
                }

                @Override
                public Map I000II() {
                    switch (this.I0000Il00O) {
                        case 0:
/* 591 */                   HashMap map = new HashMap();
/* 596 */                   I0OO1lio1i i0OO1lio1iI001lIiIIo1O = I0OO1o1ooI.I001lIiIIo1O();
/* 600 */                   i0OO1lio1iI001lIiIIo1O.I0000oI00();
/* 607 */                   ((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O.I00iiI).I001lloI();
/* 610 */                   I0OOio00OIo i0OOio00OIoI001lIiIIo1O = I0OOl1o0oO.I001lIiIIo1O();
/* 614 */                   i0OOio00OIoI001lIiIIo1O.I0000oI00();
/* 621 */                   ((I0OOl1o0oO) i0OOio00OIoI001lIiIIo1O.I00iiI).I001lllioOl();
/* 628 */                   I0OOl1o0oO i0OOl1o0oO = (I0OOl1o0oO) i0OOio00OIoI001lIiIIo1O.I00000oOI();
/* 630 */                   i0OO1lio1iI001lIiIIo1O.I0000oI00();
/* 637 */                   ((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O.I00iiI).I00II0Ol1O0l(i0OOl1o0oO);
/* 651 */                   map.put("AES_CMAC", new O0OIol0o((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O.I00000oOI(), 1));
/* 656 */                   I0OO1lio1i i0OO1lio1iI001lIiIIo1O2 = I0OO1o1ooI.I001lIiIIo1O();
/* 660 */                   i0OO1lio1iI001lIiIIo1O2.I0000oI00();
/* 667 */                   ((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O2.I00iiI).I001lloI();
/* 670 */                   I0OOio00OIo i0OOio00OIoI001lIiIIo1O2 = I0OOl1o0oO.I001lIiIIo1O();
/* 674 */                   i0OOio00OIoI001lIiIIo1O2.I0000oI00();
/* 681 */                   ((I0OOl1o0oO) i0OOio00OIoI001lIiIIo1O2.I00iiI).I001lllioOl();
/* 688 */                   I0OOl1o0oO i0OOl1o0oO2 = (I0OOl1o0oO) i0OOio00OIoI001lIiIIo1O2.I00000oOI();
/* 690 */                   i0OO1lio1iI001lIiIIo1O2.I0000oI00();
/* 697 */                   ((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O2.I00iiI).I00II0Ol1O0l(i0OOl1o0oO2);
/* 711 */                   map.put("AES256_CMAC", new O0OIol0o((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O2.I00000oOI(), 1));
/* 716 */                   I0OO1lio1i i0OO1lio1iI001lIiIIo1O3 = I0OO1o1ooI.I001lIiIIo1O();
/* 720 */                   i0OO1lio1iI001lIiIIo1O3.I0000oI00();
/* 727 */                   ((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O3.I00iiI).I001lloI();
/* 730 */                   I0OOio00OIo i0OOio00OIoI001lIiIIo1O3 = I0OOl1o0oO.I001lIiIIo1O();
/* 734 */                   i0OOio00OIoI001lIiIIo1O3.I0000oI00();
/* 741 */                   ((I0OOl1o0oO) i0OOio00OIoI001lIiIIo1O3.I00iiI).I001lllioOl();
/* 748 */                   I0OOl1o0oO i0OOl1o0oO3 = (I0OOl1o0oO) i0OOio00OIoI001lIiIIo1O3.I00000oOI();
/* 750 */                   i0OO1lio1iI001lIiIIo1O3.I0000oI00();
/* 757 */                   ((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O3.I00iiI).I00II0Ol1O0l(i0OOl1o0oO3);
/* 771 */                   map.put("AES256_CMAC_RAW", new O0OIol0o((I0OO1o1ooI) i0OO1lio1iI001lIiIIo1O3.I00000oOI(), 3));
/* 774 */                   return Collections.unmodifiableMap(map);
                        case 1:
/* 545 */                   HashMap map2 = new HashMap();
/* 554 */                   map2.put("AES128_CTR_HMAC_SHA256", I0Oi0oOOollO.I000o00OoI0I(16, 16, 1));
/* 563 */                   map2.put("AES128_CTR_HMAC_SHA256_RAW", I0Oi0oOOollO.I000o00OoI0I(16, 16, 3));
/* 572 */                   map2.put("AES256_CTR_HMAC_SHA256", I0Oi0oOOollO.I000o00OoI0I(32, 32, 1));
/* 581 */                   map2.put("AES256_CTR_HMAC_SHA256_RAW", I0Oi0oOOollO.I000o00OoI0I(32, 32, 3));
/* 584 */                   return Collections.unmodifiableMap(map2);
                        case 2:
/* 479 */                   HashMap map3 = new HashMap();
/* 493 */                   map3.put("AES128_CTR_HMAC_SHA256_4KB", new O0OIol0o(I0Oi0oOOollO.I000iOII(16, 16, Barcode.FORMAT_AZTEC), 3));
/* 507 */                   map3.put("AES128_CTR_HMAC_SHA256_1MB", new O0OIol0o(I0Oi0oOOollO.I000iOII(16, 16, 1048576), 3));
/* 521 */                   map3.put("AES256_CTR_HMAC_SHA256_4KB", new O0OIol0o(I0Oi0oOOollO.I000iOII(32, 32, Barcode.FORMAT_AZTEC), 3));
/* 535 */                   map3.put("AES256_CTR_HMAC_SHA256_1MB", new O0OIol0o(I0Oi0oOOollO.I000iOII(32, 32, 1048576), 3));
/* 538 */                   return Collections.unmodifiableMap(map3);
                        case 3:
                        case 11:
                        case 12:
                        default:
/* 16 */                    return super.I000II();
                        case 4:
/* 433 */                   HashMap map4 = new HashMap();
/* 442 */                   map4.put("AES128_EAX", I0Oi0oOOollO.I000lI(16, 1));
/* 451 */                   map4.put("AES128_EAX_RAW", I0Oi0oOOollO.I000lI(16, 3));
/* 460 */                   map4.put("AES256_EAX", I0Oi0oOOollO.I000lI(32, 1));
/* 469 */                   map4.put("AES256_EAX_RAW", I0Oi0oOOollO.I000lI(32, 3));
/* 472 */                   return Collections.unmodifiableMap(map4);
                        case 5:
/* 367 */                   HashMap map5 = new HashMap();
/* 381 */                   map5.put("AES128_GCM_HKDF_4KB", new O0OIol0o(I0Oi0oOOollO.I000l1(16, 16, Barcode.FORMAT_AZTEC), 3));
/* 395 */                   map5.put("AES128_GCM_HKDF_1MB", new O0OIol0o(I0Oi0oOOollO.I000l1(16, 16, 1048576), 3));
/* 409 */                   map5.put("AES256_GCM_HKDF_4KB", new O0OIol0o(I0Oi0oOOollO.I000l1(32, 32, Barcode.FORMAT_AZTEC), 3));
/* 423 */                   map5.put("AES256_GCM_HKDF_1MB", new O0OIol0o(I0Oi0oOOollO.I000l1(32, 32, 1048576), 3));
/* 426 */                   return Collections.unmodifiableMap(map5);
                        case 6:
/* 321 */                   HashMap map6 = new HashMap();
/* 330 */                   map6.put("AES128_GCM", I0Oi0oOOollO.I000oI1ioi(16, 1));
/* 339 */                   map6.put("AES128_GCM_RAW", I0Oi0oOOollO.I000oI1ioi(16, 3));
/* 348 */                   map6.put("AES256_GCM", I0Oi0oOOollO.I000oI1ioi(32, 1));
/* 357 */                   map6.put("AES256_GCM_RAW", I0Oi0oOOollO.I000oI1ioi(32, 3));
/* 360 */                   return Collections.unmodifiableMap(map6);
                        case 7:
/* 275 */                   HashMap map7 = new HashMap();
/* 284 */                   map7.put("AES128_GCM_SIV", I0Oi0oOOollO.I00100l0(16, 1));
/* 293 */                   map7.put("AES128_GCM_SIV_RAW", I0Oi0oOOollO.I00100l0(16, 3));
/* 302 */                   map7.put("AES256_GCM_SIV", I0Oi0oOOollO.I00100l0(32, 1));
/* 311 */                   map7.put("AES256_GCM_SIV_RAW", I0Oi0oOOollO.I00100l0(32, 3));
/* 314 */                   return Collections.unmodifiableMap(map7);
                        case 8:
/* 205 */                   HashMap map8 = new HashMap();
/* 210 */                   I0i0oilio i0i0oilioI001l0I00 = I0i10O1iiio.I001l0I00();
/* 214 */                   i0i0oilioI001l0I00.I0000oI00();
/* 221 */                   ((I0i10O1iiio) i0i0oilioI001l0I00.I00iiI).I001lllioOl();
/* 235 */                   map8.put("AES256_SIV", new O0OIol0o((I0i10O1iiio) i0i0oilioI001l0I00.I00000oOI(), 1));
/* 240 */                   I0i0oilio i0i0oilioI001l0I002 = I0i10O1iiio.I001l0I00();
/* 244 */                   i0i0oilioI001l0I002.I0000oI00();
/* 251 */                   ((I0i10O1iiio) i0i0oilioI001l0I002.I00iiI).I001lllioOl();
/* 265 */                   map8.put("AES256_SIV_RAW", new O0OIol0o((I0i10O1iiio) i0i0oilioI001l0I002.I00000oOI(), 3));
/* 268 */                   return Collections.unmodifiableMap(map8);
                        case 9:
/* 167 */                   HashMap map9 = new HashMap();
/* 181 */                   map9.put("CHACHA20_POLY1305", new O0OIol0o(IO0o1II00il.I001iOo1i0O(), 1));
/* 195 */                   map9.put("CHACHA20_POLY1305_RAW", new O0OIol0o(IO0o1II00il.I001iOo1i0O(), 3));
/* 198 */                   return Collections.unmodifiableMap(map9);
                        case 10:
/* 61 */                    HashMap map10 = new HashMap();
/* 64 */                    Io1IOo0o10ol io1IOo0o10ol = Io1IOo0o10ol.SHA256;
/* 72 */                    map10.put("HMAC_SHA256_128BITTAG", Io1lOiII0.I000iOII(32, 16, io1IOo0o10ol, 1));
/* 81 */                    map10.put("HMAC_SHA256_128BITTAG_RAW", Io1lOiII0.I000iOII(32, 16, io1IOo0o10ol, 3));
/* 90 */                    map10.put("HMAC_SHA256_256BITTAG", Io1lOiII0.I000iOII(32, 32, io1IOo0o10ol, 1));
/* 99 */                    map10.put("HMAC_SHA256_256BITTAG_RAW", Io1lOiII0.I000iOII(32, 32, io1IOo0o10ol, 3));
/* 104 */                   Io1IOo0o10ol io1IOo0o10ol2 = Io1IOo0o10ol.SHA512;
/* 112 */                   map10.put("HMAC_SHA512_128BITTAG", Io1lOiII0.I000iOII(64, 16, io1IOo0o10ol2, 1));
/* 121 */                   map10.put("HMAC_SHA512_128BITTAG_RAW", Io1lOiII0.I000iOII(64, 16, io1IOo0o10ol2, 3));
/* 130 */                   map10.put("HMAC_SHA512_256BITTAG", Io1lOiII0.I000iOII(64, 32, io1IOo0o10ol2, 1));
/* 139 */                   map10.put("HMAC_SHA512_256BITTAG_RAW", Io1lOiII0.I000iOII(64, 32, io1IOo0o10ol2, 3));
/* 148 */                   map10.put("HMAC_SHA512_512BITTAG", Io1lOiII0.I000iOII(64, 64, io1IOo0o10ol2, 1));
/* 157 */                   map10.put("HMAC_SHA512_512BITTAG_RAW", Io1lOiII0.I000iOII(64, 64, io1IOo0o10ol2, 3));
/* 160 */                   return Collections.unmodifiableMap(map10);
                        case 13:
/* 23 */                    HashMap map11 = new HashMap();
/* 37 */                    map11.put("XCHACHA20_POLY1305", new O0OIol0o(i01o1oIO.I001iOo1i0O(), 1));
/* 51 */                    map11.put("XCHACHA20_POLY1305_RAW", new O0OIol0o(i01o1oIO.I001iOo1i0O(), 3));
/* 54 */                    return Collections.unmodifiableMap(map11);
                    }
                }

                @Override
                public final I01Iio10lo I000O01llI0(IIOI1Ii1I iIOI1Ii1I) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 127 */                   return I0OO1o1ooI.I001lllioOl(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 1:
/* 118 */                   return I0Oi0IiliOi.I001lllioOl(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 2:
/* 109 */                   return I0OiIllIIO00.I001lllioOl(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 3:
/* 100 */                   return I0Ol0ll0Il.I001lloI(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 4:
/* 91 */                    return I0OllI1Ol.I001lllioOl(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 5:
/* 82 */                    return I0OoIoIilio.I001lllioOl(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 6:
/* 73 */                    return I0Ooo0oloo1.I001lIiIIo1O(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 7:
/* 64 */                    return I0i0ill11.I001lIiIIo1O(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 8:
/* 55 */                    return I0i10O1iiio.I001lIiIIo1O(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 9:
/* 46 */                    return IO0o1II00il.I001l0I00(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 10:
/* 37 */                    return Io1lOi.I001lloI(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 11:
/* 28 */                    return O0i1I1i.I001lIiIIo1O(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        case 12:
/* 19 */                    return O0i1OoIO.I001lloI(iIOI1Ii1I, Il1llO11O.I00000oIO());
                        default:
/* 10 */                    return i01o1oIO.I001l0I00(iIOI1Ii1I, Il1llO11O.I00000oIO());
                    }
                }

                @Override
                public final void I000OOo1O(I01Iio10lo i01Iio10lo) throws GeneralSecurityException {
                    switch (this.I0000Il00O) {
                        case 0:
/* 367 */                   I0OO1o1ooI i0OO1o1ooI = (I0OO1o1ooI) i01Iio10lo;
/* 373 */                   I0OOO01.I000iOII(i0OO1o1ooI.I001l0I00());
/* 382 */                   if (i0OO1o1ooI.I001iOo1i0O() == 32) {
/* 390 */                       return;
                            }
/* 387 */                   IioIoO10iOiI.I000oI1ioi("AesCmacKey size wrong, must be 32 bytes");
/* 390 */                   return;
                        case 1:
/* 236 */                   I0Oi0IiliOi i0Oi0IiliOi = (I0Oi0IiliOi) i01Iio10lo;
/* 246 */                   I0OO1oilIOl[] i0OO1oilIOlArr = {new I0OO1oilIOl(3, I0OillIOOOIl.class)};
/* 252 */                   HashMap map = new HashMap();
/* 258 */                   for (I0OO1oilIOl i0OO1oilIOl : i0OO1oilIOlArr) {
/* 264 */                       boolean zContainsKey = map.containsKey(i0OO1oilIOl.I00000oIO);
/* 268 */                       Class cls = i0OO1oilIOl.I00000oIO;
/* 270 */                       if (zContainsKey) {
/* 284 */                           IoOOl0iOl1io.I001l0I00("KeyTypeManager constructed with duplicate factories for primitive ", cls.getCanonicalName());
/* 366 */                           return;
                                }
/* 272 */                       map.put(cls, i0OO1oilIOl);
                            }
/* 289 */                   if (i0OO1oilIOlArr.length > 0) {
/* 293 */                       Class cls2 = i0OO1oilIOlArr[0].I00000oIO;
                            }
/* 295 */                   Collections.unmodifiableMap(map);
/* 298 */                   I0Ol0ll0Il i0Ol0ll0IlI001iOo1i0O = i0Oi0IiliOi.I001iOo1i0O();
/* 306 */                   Oolo11o0IIio.I00000oIO(i0Ol0ll0IlI001iOo1i0O.I001l0I00());
/* 309 */                   I0OlI00 i0OlI00I001lIiIIo1O = i0Ol0ll0IlI001iOo1i0O.I001lIiIIo1O();
/* 317 */                   if (i0OlI00I001lIiIIo1O.I001l0I00() < 12 || i0OlI00I001lIiIIo1O.I001l0I00() > 16) {
/* 363 */                       IioIoO10iOiI.I000oI1ioi("invalid IV size");
/* 366 */                       return;
                            }
/* 327 */                   new Io1lOiII0();
/* 330 */                   Io1lOi io1lOiI001l0I00 = i0Oi0IiliOi.I001l0I00();
/* 338 */                   if (io1lOiI001l0I00.I001l0I00() < 16) {
/* 359 */                       IioIoO10iOiI.I000oI1ioi("key too short");
/* 366 */                       return;
                            } else {
/* 344 */                       Io1lOiII0.I000lI(io1lOiI001l0I00.I001lIiIIo1O());
/* 355 */                       Oolo11o0IIio.I00000oIO(i0Oi0IiliOi.I001iOo1i0O().I001l0I00());
/* 366 */                       return;
                            }
                        case 2:
/* 216 */                   I0OiIllIIO00 i0OiIllIIO00 = (I0OiIllIIO00) i01Iio10lo;
/* 222 */                   if (i0OiIllIIO00.I001iOo1i0O() >= 16) {
/* 228 */                       I0Oi0oOOollO.I00100o1O0lo(i0OiIllIIO00.I001l0I00());
/* 235 */                       return;
                            } else {
/* 232 */                       IioIoO10iOiI.I000oI1ioi("key_size must be at least 16 bytes");
/* 235 */                       return;
                            }
                        case 3:
/* 186 */                   I0Ol0ll0Il i0Ol0ll0Il = (I0Ol0ll0Il) i01Iio10lo;
/* 192 */                   Oolo11o0IIio.I00000oIO(i0Ol0ll0Il.I001l0I00());
/* 195 */                   I0OlI00 i0OlI00I001lIiIIo1O2 = i0Ol0ll0Il.I001lIiIIo1O();
/* 203 */                   if (i0OlI00I001lIiIIo1O2.I001l0I00() < 12 || i0OlI00I001lIiIIo1O2.I001l0I00() > 16) {
/* 212 */                       IioIoO10iOiI.I000oI1ioi("invalid IV size");
/* 215 */                       return;
                            }
/* 215 */                   return;
                        case 4:
/* 150 */                   I0OllI1Ol i0OllI1Ol = (I0OllI1Ol) i01Iio10lo;
/* 156 */                   Oolo11o0IIio.I00000oIO(i0OllI1Ol.I001iOo1i0O());
/* 167 */                   if (i0OllI1Ol.I001l0I00().I001l0I00() == 12 || i0OllI1Ol.I001l0I00().I001l0I00() == 16) {
/* 185 */                       return;
                            }
/* 182 */                   IioIoO10iOiI.I000oI1ioi("invalid IV size; acceptable values have 12 or 16 bytes");
/* 185 */                   return;
                        case 5:
/* 130 */                   I0OoIoIilio i0OoIoIilio = (I0OoIoIilio) i01Iio10lo;
/* 136 */                   if (i0OoIoIilio.I001iOo1i0O() >= 16) {
/* 142 */                       I0Oi0oOOollO.I0010I0i(i0OoIoIilio.I001l0I00());
/* 149 */                       return;
                            } else {
/* 146 */                       IioIoO10iOiI.I000oI1ioi("key_size must be at least 16 bytes");
/* 149 */                       return;
                            }
                        case 6:
/* 126 */                   Oolo11o0IIio.I00000oIO(((I0Ooo0oloo1) i01Iio10lo).I001iOo1i0O());
/* 129 */                   return;
                        case 7:
/* 116 */                   Oolo11o0IIio.I00000oIO(((I0i0ill11) i01Iio10lo).I001iOo1i0O());
/* 119 */                   return;
                        case 8:
/* 70 */                    I0i10O1iiio i0i10O1iiio = (I0i10O1iiio) i01Iio10lo;
/* 78 */                    if (i0i10O1iiio.I001iOo1i0O() == 64) {
/* 80 */                        return;
                            }
/* 109 */                   throw new InvalidAlgorithmParameterException("invalid key size: " + i0i10O1iiio.I001iOo1i0O() + ". Valid keys must have 64 bytes.");
                        case 9:
/* 69 */                    return;
                        case 10:
/* 47 */                    Io1lOi io1lOi = (Io1lOi) i01Iio10lo;
/* 53 */                    if (io1lOi.I001l0I00() >= 16) {
/* 59 */                        Io1lOiII0.I000lI(io1lOi.I001lIiIIo1O());
/* 66 */                        return;
                            } else {
/* 63 */                        IioIoO10iOiI.I000oI1ioi("key too short");
/* 66 */                        return;
                            }
                        case 11:
/* 46 */                    return;
                        case 12:
/* 19 */                    O0i1OoIO o0i1OoIO = (O0i1OoIO) i01Iio10lo;
/* 29 */                    if (o0i1OoIO.I001lIiIIo1O().isEmpty() || !o0i1OoIO.I001lllioOl()) {
/* 40 */                        IioIoO10iOiI.I000oI1ioi("invalid key format: missing KEK URI or DEK template");
/* 43 */                        return;
                            }
/* 43 */                    return;
                        default:
/* 18 */                    return;
                    }
                }

/* 11 */        public I0OOIoIloi(Class cls) {
                    super(1, cls);
                }

/* 12 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, char c, boolean z) {
/* 13 */            super(1, O0i1OoIO.class);
                }

/* 13 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, byte b, boolean z) {
/* 14 */            super(1, I0Ooo0oloo1.class);
                }

/* 14 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, byte b, byte b2) {
/* 15 */            super(1, I0i0ill11.class);
                }

/* 15 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, byte b, int i) {
/* 16 */            super(1, IO0o1II00il.class);
                }

/* 16 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, int i) {
/* 17 */            super(1, I0OllI1Ol.class);
                }

/* 17 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, char c) {
/* 18 */            super(1, I0Ol0ll0Il.class);
                }

/* 18 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, char c, byte b) {
/* 19 */            super(1, i01o1oIO.class);
                }

/* 19 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, byte b, char c) {
/* 20 */            super(1, I0i10O1iiio.class);
                }

/* 20 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, short s) {
/* 21 */            super(1, I0OoIoIilio.class);
                }

/* 21 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO) {
/* 22 */            super(1, I0Oi0IiliOi.class);
                }

/* 22 */        public I0OOIoIloi(I0Oi0oOOollO i0Oi0oOOollO, byte b) {
/* 23 */            super(1, I0OiIllIIO00.class);
                }

/* 23 */        public I0OOIoIloi(Io1lOiII0 io1lOiII0) {
/* 24 */            super(1, Io1lOi.class);
                }
            }
