            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
/* 10 */    public final class I10iOo0il1 extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Object I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10iOo0il1(O0iiliOio o0iiliOio, OOo0IO oOo0IO, Oiol1OoI oiol1OoI) {
/* 8 */             super(1);
/* 3 */             this.I00iOIl = 9;
/* 5 */             this.I00iiI = o0iiliOio;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 235 */                   return Boolean.valueOf(O0000Ioio00.I0000O(obj, obj2));
                        case 1:
/* 207 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 209 */                   ArrayList arrayList = (ArrayList) obj2;
/* 211 */                   int size = arrayList.size();
/* 216 */                   for (int i2 = 0; i2 < size; i2++) {
/* 2 */                         oO11o0IO.I000O01llI0((OO1I0001000i) arrayList.get(i2), 0, 0, 0.0f);
                            }
/* 230 */                   return ooiIlOl1iI;
                        case 2:
/* 129 */                   I110o0lol i110o0lol = (I110o0lol) obj;
/* 131 */                   float f = i110o0lol.I00000oOI;
/* 136 */                   if (f < 0.0f) {
/* 138 */                       f = 0.0f;
                            }
/* 143 */                   if (f > 1.0f) {
/* 145 */                       f = 1.0f;
                            }
/* 146 */                   float f2 = i110o0lol.I0000Il00O;
/* 152 */                   if (f2 < -0.5f) {
/* 154 */                       f2 = -0.5f;
                            }
/* 159 */                   if (f2 > 0.5f) {
/* 161 */                       f2 = 0.5f;
                            }
/* 162 */                   float f3 = i110o0lol.I0000O;
/* 166 */                   float f4 = f3 >= -0.5f ? f3 : -0.5f;
/* 172 */                   float f5 = f4 <= 0.5f ? f4 : 0.5f;
/* 176 */                   float f6 = i110o0lol.I00000oIO;
/* 180 */                   float f7 = f6 >= 0.0f ? f6 : 0.0f;
/* 202 */                   return IOOiio0i.I00000oIO(IOOiio0i.I00000oOI(iiO01ll11o1l.I00000oIO(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, IOOlIOOi0O0.I001i1lo1io), (IOOl0ll) obj2));
                        case 3:
/* 126 */                   ((IiiI0l01O) obj2).I00li1OI = true;
/* 128 */                   return ooiIlOl1iI;
                        case 4:
/* 59 */                    IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 61 */                    Io10IOI io10IOI = (Io10IOI) obj2;
/* 63 */                    I0ol0lI i0ol0lI = io10IOI.I000l1;
/* 67 */                    if (io10IOI.I000o00OoI0I && io10IOI.I001lIiIIo1O && i0ol0lI != null) {
/* 75 */                        IOO000ilo iOO000iloI00iiI = iilloIOOO0i.I00iiI();
/* 79 */                        long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 87 */                        iOO000iloI00iiI.I0010o().I000II();
                                try {
/* 102 */                           ((IOO000ilo) ((IIOOoll) iOO000iloI00iiI.I00iiI).I00iiI).I0010o().I000l1(i0ol0lI);
/* 105 */                           io10IOI.I0000Il00O(iilloIOOO0i);
                                } finally {
/* 113 */                           IIlIOloOOO.I001IO000(iOO000iloI00iiI, jI001iOo1i0O);
                                }
                            } else {
/* 117 */                       io10IOI.I0000Il00O(iilloIOOO0i);
                            }
/* 120 */                   return ooiIlOl1iI;
                        case 5:
/* 55 */                    ((ListenableFuture) obj2).cancel(false);
/* 58 */                    return ooiIlOl1iI;
                        case 6:
                            return obj == ((OI0oiiIO0) obj2) ? "(this)" : String.valueOf(obj);
                        case 7:
                            return obj == ((OI0olI1Oii0I) obj2) ? "(this)" : String.valueOf(obj);
                        case 8:
                            return obj == ((OI10IIO) obj2) ? "(this)" : String.valueOf(obj);
                        default:
/* 17 */                    ((O0iiliOio) obj2).I00000oOI();
/* 20 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public I10iOo0il1(Object obj, int i) {
                    super(1);
/* 12 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }
            }
