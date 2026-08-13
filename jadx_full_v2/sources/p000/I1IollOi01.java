            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
/* 8 */     public final class I1IollOi01 implements Iterable, O0IlIoi {
                public final int I00iOIl;
                public Object I00iiI;

                public I1IollOi01(IllOOo00lI illOOo00lI) {
/* 2 */             this.I00iOIl = 1;
/* 7 */             this.I00iiI = illOOo00lI;
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 61 */                    return iOO1OO.I00000oIO((Object[]) this.I00iiI);
                        case 1:
/* 45 */                    Iterator it = (Iterator) ((IllOOo00lI) this.I00iiI).invoke();
/* 48 */                    Iio0IIOo iio0IIOo = new Iio0IIOo(1);
/* 51 */                    iio0IIOo.I00iiI = it;
/* 53 */                    VarHandle.storeStoreFence();
/* 56 */                    return iio0IIOo;
                        case 2:
/* 30 */                    return ((OilO0iOl) this.I00iiI).iterator();
                        default:
/* 10 */                    Il0lIiOiO1i il0lIiOiO1i = (Il0lIiOiO1i) this.I00iiI;
/* 13 */                    I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(2);
/* 16 */                    i01I0Iioooo0.I00iiO = il0lIiOiO1i;
/* 20 */                    i01I0Iioooo0.I00iiI = il0lIiOiO1i.I0000Il00O;
/* 22 */                    VarHandle.storeStoreFence();
/* 25 */                    return i01I0Iioooo0;
                    }
                }

/* 9 */         public I1IollOi01(int i) {
/* 10 */            this.I00iOIl = i;
                }
            }
