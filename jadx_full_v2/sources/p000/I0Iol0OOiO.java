            package p000;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class I0Iol0OOiO implements Function1 {
                public final int I00iOIl;
                public Ol1o1llOII I00iiI;
                public OI10i0Il I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object invoke(Object obj) throws IOException {
                    Object next;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 89 */                    Ol1o1llOII ol1o1llOII = this.I00iiI;
/* 91 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 93 */                    OI10i0Il oI10i0Il2 = this.I00iio;
/* 95 */                    String str = (String) obj;
/* 99 */                    ol1o1llOII.put(str, "");
/* 102 */                   oI10i0Il.setValue(str);
/* 107 */                   oI10i0Il2.setValue(Boolean.TRUE);
                            break;
                        default:
/* 8 */                     Ol1o1llOII ol1o1llOII2 = this.I00iiI;
/* 10 */                    OI10i0Il oI10i0Il3 = this.I00iiO;
/* 12 */                    OI10i0Il oI10i0Il4 = this.I00iio;
/* 16 */                    ol1o1llOII2.clear();
/* 19 */                    ol1o1llOII2.putAll((Map) obj);
/* 22 */                    Ol1lII ol1lII = ol1o1llOII2.I00iiO;
/* 31 */                    IOOi0Ool1i.I00IlilI0i0i(ol1lII, ",", null, null, null, 62);
/* 34 */                    List list = I0O0l00olII.I00000oIO;
/* 38 */                    oI10i0Il3.setValue(Boolean.FALSE);
/* 41 */                    Iterator it = ol1lII.iterator();
                            while (true) {
/* 52 */                        if (((OlO1010i1l) it).hasNext()) {
/* 57 */                            next = ((OlO1010i1l) it).next();
/* 70 */                            if (O0000Ioio00.I0000O((String) next, "index.html")) {
                                    }
                                } else {
/* 73 */                            next = null;
                                }
                            }
/* 74 */                    String str2 = (String) next;
/* 76 */                    if (str2 == null) {
/* 83 */                        str2 = (String) IOOi0Ool1i.I001lloI(ol1lII);
                            }
/* 85 */                    oI10i0Il4.setValue(str2);
                            break;
                    }
/* 88 */            return ooiIlOl1iI;
                }
            }
