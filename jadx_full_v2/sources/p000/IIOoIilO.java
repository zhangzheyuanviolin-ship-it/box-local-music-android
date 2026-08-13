            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IIOoIilO extends IIOoOiOI implements Iterable {
                public final ArrayList I00iOIl = new ArrayList();

                public final void I00ioIO(IIOoOiOI iIOoOiOI) {
/* 3 */             this.I00iOIl.add(iIOoOiOI);
                }

                public final IIOoOiOI I00l0I0l0lO1(int i) {
/* 7 */             return (IIOoOiOI) this.I00iOIl.get(i);
                }

                public final int I00lli11(int i, int i2) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 7 */             if (i < arrayList.size()) {
/* 9 */                 Object obj = arrayList.get(i);
/* 15 */                if (obj instanceof IIi0IoOo) {
/* 19 */                    return ((IIi0IoOo) obj).I00lli11();
                        }
                    }
/* 89 */            return i2;
                }

                public final IIOoOiOI I00lll10(int i) {
/* 7 */             IIOoOiOI iIOoOiOI = (IIOoOiOI) this.I00iOIl.get(i);
/* 11 */            if (iIOoOiOI instanceof IIi0O10I) {
/* 15 */                iIOoOiOI = ((IIi0O10I) iIOoOiOI).I00iOIl;
                    }
/* 19 */            if (iIOoOiOI instanceof IIi0II0l0o) {
/* 21 */                return null;
                    }
/* 49 */            return iIOoOiOI;
                }

                public final IIOoOiOI I00o0iI0io1(int i) {
/* 7 */             return (IIOoOiOI) this.I00iOIl.remove(i);
                }

                public final boolean I00oII(IIOoOiOI iIOoOiOI) {
/* 3 */             return this.I00iOIl.remove(iIOoOiOI);
                }

                public final void I00oliIiO01i(int i, IIOoOiOI iIOoOiOI) {
/* 3 */             this.I00iOIl.set(i, iIOoOiOI);
                }

                public final float[] I00oo1iO0ll() {
/* 3 */             int size = this.I00iOIl.size();
/* 7 */             float[] fArr = new float[size];
/* 10 */            for (int i = 0; i < size; i++) {
/* 12 */                IIOoOiOI iIOoOiOII00lll10 = I00lll10(i);
/* 28 */                fArr[i] = iIOoOiOII00lll10 instanceof IIi0IoOo ? ((IIi0IoOo) iIOoOiOII00lll10).I00ioIO() : 0.0f;
                    }
/* 113 */           return fArr;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return this.I00iOIl.iterator();
                }

                public final String toString() {
/* 18 */            return "COSArray{" + this.I00iOIl + "}";
                }
            }
