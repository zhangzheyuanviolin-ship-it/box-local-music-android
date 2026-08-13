            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class I1IloI0 implements Iterator, Map.Entry {
                public int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public I1Io0i0II I00iio;

                @Override
                public final boolean equals(Object obj) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iio;
/* 6 */             if (!this.I00iiO) {
/* 52 */                I000II.I001IO000("This container does not support retaining Map.Entry objects");
/* 5 */                 return false;
                    }
/* 10 */            if (obj instanceof Map.Entry) {
/* 13 */                Map.Entry entry = (Map.Entry) obj;
/* 29 */                if (O0000Ioio00.I0000O(entry.getKey(), i1Io0i0II.I000II(this.I00iiI)) && O0000Ioio00.I0000O(entry.getValue(), i1Io0i0II.I000OiO(this.I00iiI))) {
/* 47 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final Object getKey() {
/* 3 */             if (this.I00iiO) {
/* 9 */                 return this.I00iio.I000II(this.I00iiI);
                    }
/* 16 */            I000II.I001IO000("This container does not support retaining Map.Entry objects");
/* 19 */            return null;
                }

                @Override
                public final Object getValue() {
/* 3 */             if (this.I00iiO) {
/* 9 */                 return this.I00iio.I000OiO(this.I00iiI);
                    }
/* 16 */            I000II.I001IO000("This container does not support retaining Map.Entry objects");
/* 19 */            return null;
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iiI < this.I00iOIl;
                }

                @Override
                public final int hashCode() {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iio;
/* 6 */             if (!this.I00iiO) {
/* 40 */                I000II.I001IO000("This container does not support retaining Map.Entry objects");
/* 5 */                 return 0;
                    }
/* 10 */            Object objI000II = i1Io0i0II.I000II(this.I00iiI);
/* 16 */            Object objI000OiO = i1Io0i0II.I000OiO(this.I00iiI);
/* 35 */            return (objI000II == null ? 0 : objI000II.hashCode()) ^ (objI000OiO != null ? objI000OiO.hashCode() : 0);
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 16 */                IoOOl0iOl1io.I00000oOI();
/* 19 */                return null;
                    }
                    this.I00iiI++;
/* 13 */            this.I00iiO = true;
/* 15 */            return this;
                }

                @Override
                public final void remove() {
/* 3 */             if (!this.I00iiO) {
/* 28 */                IOOlIIilOl0.I000iOII();
/* 55 */                return;
                    }
/* 9 */             this.I00iio.I000O01llI0(this.I00iiI);
                    this.I00iiI--;
                    this.I00iOIl--;
/* 25 */            this.I00iiO = false;
                }

                @Override
                public final Object setValue(Object obj) {
/* 3 */             if (this.I00iiO) {
/* 9 */                 return this.I00iio.I000OOo1O(this.I00iiI, obj);
                    }
/* 16 */            I000II.I001IO000("This container does not support retaining Map.Entry objects");
/* 19 */            return null;
                }

                public final String toString() {
/* 25 */            return getKey() + "=" + getValue();
                }
            }
