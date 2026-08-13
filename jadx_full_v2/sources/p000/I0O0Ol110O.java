            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 12 */    public final class I0O0Ol110O implements IllOOo00lI {
                public final int I00iOIl;
                public Function1 I00iiI;
                public OI10i0Il I00iiO;
                public OI10i0Il I00iio;

                public I0O0Ol110O(Function1 function1, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 2 */             this.I00iOIl = 3;
/* 7 */             this.I00iiI = function1;
/* 9 */             this.I00iiO = oI10i0Il;
/* 11 */            this.I00iio = oI10i0Il2;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 84 */                    Function1 function1 = this.I00iiI;
/* 86 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 88 */                    OI10i0Il oI10i0Il2 = this.I00iio;
/* 104 */                   function1.invoke(OlOoOIi0o.I00OIo((String) oI10i0Il.getValue()).toString());
/* 109 */                   oI10i0Il.setValue("");
/* 114 */                   oI10i0Il2.setValue(Boolean.FALSE);
                            break;
                        case 1:
/* 52 */                    Function1 function12 = this.I00iiI;
/* 54 */                    OI10i0Il oI10i0Il3 = this.I00iiO;
/* 56 */                    OI10i0Il oI10i0Il4 = this.I00iio;
/* 66 */                    String str = ((Oo0OI01Il) oI10i0Il3.getValue()).I00000oIO.I00iiI;
/* 72 */                    if (!I0O1ii1l.I00000oOI(str)) {
/* 80 */                        oI10i0Il4.setValue(Boolean.TRUE);
                                break;
                            } else {
/* 74 */                        function12.invoke(str);
                                break;
                            }
                        case 2:
/* 27 */                    Function1 function13 = this.I00iiI;
/* 29 */                    OI10i0Il oI10i0Il5 = this.I00iiO;
/* 31 */                    OI10i0Il oI10i0Il6 = this.I00iio;
/* 35 */                    oI10i0Il5.setValue(Boolean.FALSE);
/* 48 */                    function13.invoke(((Oo0OI01Il) oI10i0Il6.getValue()).I00000oIO.I00iiI);
                            break;
                        default:
/* 8 */                     Function1 function14 = this.I00iiI;
/* 10 */                    OI10i0Il oI10i0Il7 = this.I00iiO;
/* 12 */                    OI10i0Il oI10i0Il8 = this.I00iio;
/* 15 */                    l1O0o1.I0000Il00O(oI10i0Il7, false);
/* 18 */                    Boolean bool = Boolean.TRUE;
/* 20 */                    oI10i0Il8.setValue(bool);
/* 23 */                    function14.invoke(bool);
                            break;
                    }
/* 26 */            return ooiIlOl1iI;
                }
            }
