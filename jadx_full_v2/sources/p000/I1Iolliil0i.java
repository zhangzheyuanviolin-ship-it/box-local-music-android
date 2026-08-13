            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class I1Iolliil0i implements OilO0iOl {
                public final int I00000oIO;
                public Object I00000oOI;

                public I1Iolliil0i(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00000oIO) {
                        case 0:
/* 76 */                    return iOO1OO.I00000oIO((Object[]) this.I00000oOI);
                        case 1:
/* 67 */                    return ((Iterable) this.I00000oOI).iterator();
                        case 2:
/* 54 */                    O0ooOOI10 o0ooOOI10 = new O0ooOOI10();
/* 57 */                    o0ooOOI10.I00iiO = this;
/* 59 */                    VarHandle.storeStoreFence();
/* 62 */                    return o0ooOOI10;
                        case 3:
/* 47 */                    return OilOIIlI.I00000oIO((IlliIl1l11O) this.I00000oOI);
                        case 4:
/* 40 */                    return (Iterator) this.I00000oOI;
                        case 5:
/* 23 */                    Object obj = this.I00000oOI;
/* 26 */                    OilOIO0i01l oilOIO0i01l = new OilOIO0i01l(0);
/* 29 */                    oilOIO0i01l.I00iiI = obj;
/* 32 */                    oilOIO0i01l.I00iiO = true;
/* 34 */                    VarHandle.storeStoreFence();
/* 37 */                    return oilOIO0i01l;
                        default:
/* 10 */                    CharSequence charSequence = (CharSequence) this.I00000oOI;
/* 12 */                    O0ooOO o0ooOO = new O0ooOO();
/* 15 */                    o0ooOO.I00iOIl = charSequence;
/* 17 */                    VarHandle.storeStoreFence();
/* 20 */                    return o0ooOO;
                    }
                }
            }
