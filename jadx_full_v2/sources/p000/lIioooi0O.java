            package p000;

            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class lIioooi0O extends lIiI1010Ool {
                public final int I00o0l1o1o0;
                public final transient ii01iIOliOOI I00o101lO;
                public final transient Serializable I00oI0i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lIioooi0O(ii01iIOliOOI ii01iioliooi, Serializable serializable, int i) {
/* 5 */             super(11);
/* 1 */             this.I00o0l1o1o0 = i;
/* 8 */             this.I00o101lO = ii01iioliooi;
/* 10 */            this.I00oI0i = serializable;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
                    switch (this.I00o0l1o1o0) {
                        case 0:
/* 15 */                    lIOiOOl lioioolI001lIiIIo1O = this.I00lll10;
/* 17 */                    if (lioioolI001lIiIIo1O == null) {
/* 19 */                        lioioolI001lIiIIo1O = I001lIiIIo1O();
/* 23 */                        this.I00lll10 = lioioolI001lIiIIo1O;
                            }
/* 25 */                    return lioioolI001lIiIIo1O.I000o00OoI0I(objArr);
                        default:
/* 10 */                    return ((lIlIloOo) this.I00oI0i).I000o00OoI0I(objArr);
                    }
                }

                public lIOiOOl I001lIiIIo1O() {
/* 3 */             return new lIilo1liI01(this);
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00o0l1o1o0;
/* 5 */             ii01iIOliOOI ii01iioliooi = this.I00o101lO;
                    switch (i) {
                        case 0:
/* 20 */                    if (obj instanceof Map.Entry) {
/* 22 */                        Map.Entry entry = (Map.Entry) obj;
/* 24 */                        Object key = entry.getKey();
/* 28 */                        Object value = entry.getValue();
/* 32 */                        if (value != null && value.equals(ii01iioliooi.get(key))) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 14 */                    if (ii01iioliooi.get(obj) != null) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00o0l1o1o0) {
                        case 0:
/* 16 */                    lIOiOOl lioioolI001lIiIIo1O = this.I00lll10;
/* 18 */                    if (lioioolI001lIiIIo1O == null) {
/* 20 */                        lioioolI001lIiIIo1O = I001lIiIIo1O();
/* 24 */                        this.I00lll10 = lioioolI001lIiIIo1O;
                            }
/* 26 */                    return lioioolI001lIiIIo1O.listIterator(0);
                        default:
/* 11 */                    return ((lIlIloOo) this.I00oI0i).listIterator(0);
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00o0l1o1o0) {
                    }
/* 6 */             return 1;
                }
            }
