            package p000;

            import java.util.Map;
            
            public final class iOolo0lO0l1o extends iI0iO0iloii {
                public Object I00iiI;
                public int I00iiO;
                public iI0iIIo I00iio;

                public final void I00000oIO() {
/* 1 */             Object obj = this.I00iiI;
/* 3 */             iI0iIIo ii0iiio = this.I00iio;
/* 5 */             int i = this.I00iiO;
/* 8 */             if (i != -1 && i < ii0iiio.size()) {
/* 16 */                int i2 = this.I00iiO;
/* 18 */                Object[] objArr = ii0iiio.I00iio;
/* 20 */                objArr.getClass();
/* 29 */                if (ll1Oll0I0o1.I00000oIO(obj, objArr[i2])) {
/* 32 */                    return;
                        }
                    }
/* 33 */            Object obj2 = iI0iIIo.I00o0l1o1o0;
/* 39 */            this.I00iiO = ii0iiio.I00111O(obj);
                }

                @Override
                public final Object getKey() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Object getValue() {
/* 1 */             iI0iIIo ii0iiio = this.I00iio;
/* 3 */             Map mapI000II = ii0iiio.I000II();
/* 7 */             if (mapI000II != null) {
/* 11 */                return mapI000II.get(this.I00iiI);
                    }
/* 16 */            I00000oIO();
/* 19 */            int i = this.I00iiO;
/* 22 */            if (i == -1) {
/* 24 */                return null;
                    }
/* 26 */            Object[] objArr = ii0iiio.I00ilI0I1;
/* 28 */            objArr.getClass();
/* 31 */            return objArr[i];
                }

                @Override
                public final Object setValue(Object obj) {
/* 1 */             Object obj2 = this.I00iiI;
/* 3 */             iI0iIIo ii0iiio = this.I00iio;
/* 5 */             Map mapI000II = ii0iiio.I000II();
/* 9 */             if (mapI000II != null) {
/* 11 */                return mapI000II.put(obj2, obj);
                    }
/* 16 */            I00000oIO();
/* 19 */            int i = this.I00iiO;
/* 22 */            if (i == -1) {
/* 24 */                ii0iiio.put(obj2, obj);
/* 27 */                return null;
                    }
/* 29 */            Object[] objArr = ii0iiio.I00ilI0I1;
/* 31 */            objArr.getClass();
/* 34 */            Object obj3 = objArr[i];
/* 36 */            int i2 = this.I00iiO;
/* 38 */            Object[] objArr2 = ii0iiio.I00ilI0I1;
/* 40 */            objArr2.getClass();
/* 43 */            objArr2[i2] = obj;
/* 77 */            return obj3;
                }
            }
