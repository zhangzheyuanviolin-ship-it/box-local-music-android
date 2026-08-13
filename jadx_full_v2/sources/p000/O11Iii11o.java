            package p000;

            import java.util.List;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            
            public final class O11Iii11o implements IllOOo00lI {
                public final int I00iOIl;
                public Function1 I00iiI;
                public O1oIOiI11o0 I00iiO;
                public O11iO00I1o I00iio;
                public Function1 I00ilI0I1;
                public OI10i0Il I00ilO0;

                public O11Iii11o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Object obj;
                    IO1iI1i iO1iI1i;
                    Object objPrevious;
                    Object obj2;
                    Object objPrevious2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 110 */                   Function1 function1 = this.I00iiI;
/* 112 */                   O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 114 */                   O11iO00I1o o11iO00I1o = this.I00iio;
/* 116 */                   Function1 function12 = this.I00ilI0I1;
/* 118 */                   OI10i0Il oI10i0Il = this.I00ilO0;
/* 120 */                   function1.invoke(o1oIOiI11o0);
/* 127 */                   if (O11Oio.I0000Il00O(oI10i0Il)) {
/* 147 */                       List list = (List) ((IO1looOIi) o11iO00I1o.I0000Il00O.I00iOIl.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 149 */                       if (list != null) {
/* 155 */                           ListIterator listIterator = list.listIterator(list.size());
                                    while (true) {
/* 163 */                               if (listIterator.hasPrevious()) {
/* 165 */                                   objPrevious = listIterator.previous();
/* 170 */                                   IO1OO01i0 iO1OO01i0 = (IO1OO01i0) objPrevious;
/* 174 */                                   if (!(iO1OO01i0 instanceof IO1iI1i) || ((IO1iI1i) iO1OO01i0).I000O01llI0 != IO1loo.I00iiI) {
                                            }
                                        } else {
/* 185 */                                   objPrevious = null;
                                        }
                                    }
/* 186 */                           obj = (IO1OO01i0) objPrevious;
                                } else {
/* 189 */                           obj = null;
                                }
/* 195 */                       iO1iI1i = obj instanceof IO1iI1i ? (IO1iI1i) obj : null;
/* 197 */                       if (iO1iI1i != null) {
/* 201 */                           function12.invoke(iO1iI1i.I000II);
                                    break;
                                }
                            }
                            break;
                        default:
/* 9 */                     Function1 function13 = this.I00iiI;
/* 11 */                    O1oIOiI11o0 o1oIOiI11o02 = this.I00iiO;
/* 13 */                    O11iO00I1o o11iO00I1o2 = this.I00iio;
/* 15 */                    Function1 function14 = this.I00ilI0I1;
/* 17 */                    OI10i0Il oI10i0Il2 = this.I00ilO0;
/* 19 */                    function13.invoke(o1oIOiI11o02);
/* 32 */                    if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 52 */                        List list2 = (List) ((IO1looOIi) o11iO00I1o2.I0000Il00O.I00iOIl.getValue()).I0000O.get(o1oIOiI11o02.I00000oIO);
/* 54 */                        if (list2 != null) {
/* 60 */                            ListIterator listIterator2 = list2.listIterator(list2.size());
                                    while (true) {
/* 68 */                                if (listIterator2.hasPrevious()) {
/* 70 */                                    objPrevious2 = listIterator2.previous();
/* 75 */                                    IO1OO01i0 iO1OO01i02 = (IO1OO01i0) objPrevious2;
/* 79 */                                    if (!(iO1OO01i02 instanceof IO1iI1i) || ((IO1iI1i) iO1OO01i02).I000O01llI0 != IO1loo.I00iiI) {
                                            }
                                        } else {
/* 90 */                                    objPrevious2 = null;
                                        }
                                    }
/* 91 */                            obj2 = (IO1OO01i0) objPrevious2;
                                } else {
/* 94 */                            obj2 = null;
                                }
/* 100 */                       iO1iI1i = obj2 instanceof IO1iI1i ? (IO1iI1i) obj2 : null;
/* 102 */                       if (iO1iI1i != null) {
/* 106 */                           function14.invoke(iO1iI1i.I000II);
                                    break;
                                }
                            }
                            break;
                    }
/* 109 */           return ooiIlOl1iI;
                }
            }
