            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class I01oi1lO0O1o implements O0oiIoI0 {
                public final int I00iOIl;
                public Object I00iiI;

                public I01oi1lO0O1o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 131 */                   ((Function1) obj).invoke(o0oOOiI0);
                            break;
                        case 1:
/* 97 */                    O1ol100o0O o1ol100o0O = (O1ol100o0O) obj;
/* 105 */                   int i2 = Ilo1IOIlO0lI.I00000oIO[o0oOOiI0.ordinal()];
/* 107 */                   if (i2 != 1 && i2 != 2) {
/* 113 */                       if (i2 == 3 || i2 == 4) {
/* 121 */                           o1ol100o0O.I0000O.I00000oIO = false;
                                    break;
                                }
                            } else {
/* 126 */                       o1ol100o0O.I0000O.I00000oIO = true;
                                break;
                            }
                            break;
                        case 2:
/* 41 */                    OI1i0llli oI1i0llli = (OI1i0llli) obj;
/* 47 */                    oI1i0llli.I00100o1O0lo = o0oOOiI0.I00000oIO();
/* 51 */                    if (oI1i0llli.I0000Il00O != null) {
/* 60 */                        Iterator it = new ArrayList(oI1i0llli.I0001Ioi1lo).iterator();
/* 68 */                        while (it.hasNext()) {
/* 76 */                            OI1Oo1II110 oI1Oo1II110 = ((OI1OloOIO1O) it.next()).I00ioIO;
/* 84 */                            oI1Oo1II110.I00000oIO.I00iio = o0oOOiI0.I00000oIO();
/* 90 */                            oI1Oo1II110.I0000O = o0oOOiI0.I00000oIO();
/* 92 */                            oI1Oo1II110.I00000oOI();
                                }
                                break;
                            }
                            break;
                        case 3:
/* 26 */                    IOioOloI0o0 iOioOloI0o0 = (IOioOloI0o0) obj;
/* 28 */                    iOioOloI0o0.getClass();
/* 35 */                    iOioOloI0o0.I00iiI = o0oOOiI0.I00000oIO();
/* 37 */                    iOioOloI0o0.I00000oIO();
                            break;
                        default:
/* 10 */                    II1oo0l11IOI iI1oo0l11IOI = (II1oo0l11IOI) obj;
/* 14 */                    if (o0oOOiI0 != O0oOOiI0.ON_START) {
/* 21 */                        if (o0oOOiI0 == O0oOOiI0.ON_STOP) {
/* 23 */                            iI1oo0l11IOI.I0000Il00O = false;
                                    break;
                                }
                            } else {
/* 16 */                        iI1oo0l11IOI.I0000Il00O = true;
                                break;
                            }
                            break;
                    }
                }
            }
