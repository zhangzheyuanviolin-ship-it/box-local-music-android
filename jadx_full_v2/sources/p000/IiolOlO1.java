            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Set;
            
            public final class IiolOlO1 extends ilI1Io1io {
                public IiolOoiOIO I00000oIO;

                @Override
                public final void I00000oIO(Throwable th) {
/* 5 */             this.I00000oIO.I00000oIO.I0001Ioi1lo(th);
                }

                @Override
                public final void I00000oOI(OillOo0 oillOo0) {
/* 1 */             IiolOoiOIO iiolOoiOIO = this.I00000oIO;
/* 3 */             iiolOoiOIO.I0000Il00O = oillOo0;
/* 7 */             OillOo0 oillOo02 = iiolOoiOIO.I0000Il00O;
/* 9 */             IiollO1llli iiollO1llli = iiolOoiOIO.I00000oIO;
/* 11 */            Io1Oioii1111 io1Oioii1111 = iiollO1llli.I000II;
/* 13 */            Ii1oOi0l ii1oOi0l = iiollO1llli.I000OOo1O;
/* 15 */            Set<int[]> setI00000oIO = Iioo1ol.I00000oIO();
/* 21 */            IOO000ilo iOO000ilo = new IOO000ilo(13);
/* 24 */            iOO000ilo.I00iiI = io1Oioii1111;
/* 26 */            iOO000ilo.I00iiO = oillOo02;
/* 28 */            iOO000ilo.I00iio = ii1oOi0l;
/* 34 */            if (!setI00000oIO.isEmpty()) {
/* 45 */                for (int[] iArr : setI00000oIO) {
/* 58 */                    String str = new String(iArr, 0, iArr.length);
/* 64 */                    I0i0io0oOOi i0i0io0oOOi = new I0i0io0oOOi(3);
/* 67 */                    i0i0io0oOOi.I00iiI = str;
/* 69 */                    VarHandle.storeStoreFence();
/* 79 */                    iOO000ilo.I001lloI(str, 0, str.length(), 1, true, i0i0io0oOOi);
                        }
                    }
/* 83 */            VarHandle.storeStoreFence();
/* 86 */            iiolOoiOIO.I00000oOI = iOO000ilo;
/* 88 */            IiollO1llli iiollO1llli2 = iiolOoiOIO.I00000oIO;
/* 92 */            ArrayList arrayList = new ArrayList();
/* 101 */           iiollO1llli2.I00000oIO.writeLock().lock();
                    try {
/* 105 */               iiollO1llli2.I0000Il00O = 1;
/* 109 */               arrayList.addAll(iiollO1llli2.I00000oOI);
/* 114 */               iiollO1llli2.I00000oOI.clear();
/* 123 */               iiollO1llli2.I00000oIO.writeLock().unlock();
/* 136 */               iiollO1llli2.I0000O.post(new IIiOiIiO01O(arrayList, iiollO1llli2.I0000Il00O, null));
                    } catch (Throwable th) {
/* 148 */               iiollO1llli2.I00000oIO.writeLock().unlock();
/* 168 */               throw th;
                    }
                }
            }
