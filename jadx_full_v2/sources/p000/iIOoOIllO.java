            package p000;

            import java.util.Map;
            
            public final class iIOoOIllO extends iI0iO0iloii {
                public Object I00iiI;
                public int I00iiO;
                public iI0iIIo I00iio;

                public final void I00000oIO() {
/* 1 */             Object obj = this.I00iiI;
/* 3 */             iI0iIIo ii0iiio = this.I00iio;
/* 5 */             int i = this.I00iiO;
/* 8 */             if (i != -1 && i < ii0iiio.size()) {
/* 28 */                if (lioooIIO.I00000oIO(obj, ii0iiio.I00000oOI()[this.I00iiO])) {
/* 31 */                    return;
                        }
                    }
/* 32 */            Object obj2 = iI0iIIo.I00o0l1o1o0;
/* 38 */            this.I00iiO = ii0iiio.I001IO000(obj);
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
/* 30 */            return ii0iiio.I0000Il00O()[i];
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
/* 33 */            Object obj3 = ii0iiio.I0000Il00O()[i];
/* 41 */            ii0iiio.I0000Il00O()[this.I00iiO] = obj;
/* 49 */            return obj3;
                }
            }
