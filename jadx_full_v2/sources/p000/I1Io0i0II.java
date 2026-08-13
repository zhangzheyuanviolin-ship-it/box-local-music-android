            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class I1Io0i0II extends Ol0Ii10o1 implements Map {
                public I1IlioI1o1I I00iio;
                public I1Illo1io0 I00ilI0I1;
                public I1IloI1ii0 I00ilO0;

                public final boolean I000iOII(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 9 */             while (it.hasNext()) {
/* 19 */                if (!super.containsKey(it.next())) {
/* 21 */                    return false;
                        }
                    }
/* 23 */            return true;
                }

                public final boolean I000l1(Collection collection) {
/* 1 */             int i = this.I00iiO;
/* 3 */             Iterator it = collection.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                super.remove(it.next());
                    }
                    return i != this.I00iiO;
                }

                @Override
                public final Set entrySet() {
/* 1 */             I1IlioI1o1I i1IlioI1o1I = this.I00iio;
/* 3 */             if (i1IlioI1o1I != null) {
/* 20 */                return i1IlioI1o1I;
                    }
/* 8 */             I1IlioI1o1I i1IlioI1o1I2 = new I1IlioI1o1I(this, 0);
/* 11 */            this.I00iio = i1IlioI1o1I2;
/* 20 */            return i1IlioI1o1I2;
                }

                @Override
                public final Set keySet() {
/* 1 */             I1Illo1io0 i1Illo1io0 = this.I00ilI0I1;
/* 3 */             if (i1Illo1io0 != null) {
/* 20 */                return i1Illo1io0;
                    }
/* 7 */             I1Illo1io0 i1Illo1io02 = new I1Illo1io0();
/* 10 */            i1Illo1io02.I00iOIl = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            this.I00ilI0I1 = i1Illo1io02;
/* 20 */            return i1Illo1io02;
                }

                @Override
                public final void putAll(Map map) {
/* 7 */             int size = map.size() + this.I00iiO;
/* 8 */             int i = this.I00iiO;
/* 10 */            int[] iArr = this.I00iOIl;
/* 13 */            if (iArr.length < size) {
/* 19 */                this.I00iOIl = Arrays.copyOf(iArr, size);
/* 29 */                this.I00iiI = Arrays.copyOf(this.I00iiI, size * 2);
                    }
/* 33 */            if (this.I00iiO != i) {
/* 36 */                I000II.I001IIilI0O();
                    }
/* 51 */            for (Map.Entry entry : map.entrySet()) {
/* 67 */                put(entry.getKey(), entry.getValue());
                    }
                }

                @Override
                public final Collection values() {
/* 1 */             I1IloI1ii0 i1IloI1ii0 = this.I00ilO0;
/* 3 */             if (i1IloI1ii0 != null) {
/* 20 */                return i1IloI1ii0;
                    }
/* 7 */             I1IloI1ii0 i1IloI1ii02 = new I1IloI1ii0();
/* 10 */            i1IloI1ii02.I00iOIl = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            this.I00ilO0 = i1IloI1ii02;
/* 20 */            return i1IloI1ii02;
                }
            }
