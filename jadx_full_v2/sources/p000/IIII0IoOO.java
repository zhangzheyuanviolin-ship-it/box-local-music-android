            package p000;
            
            public final class IIII0IoOO extends I01IO1il {
                public final int I00iiO;
                public Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIII0IoOO(int i, int i2, int i3) {
/* 3 */             super(i, i2);
/* 1 */             this.I00iiO = i3;
                }

                @Override
                public final Object next() {
                    switch (this.I00iiO) {
                        case 0:
/* 30 */                    if (!hasNext()) {
/* 45 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 34 */                        Object[] objArr = (Object[]) this.I00iio;
/* 36 */                        int i = this.I00iOIl;
/* 40 */                        this.I00iOIl = i + 1;
                                break;
                            }
                        default:
/* 10 */                    if (!hasNext()) {
/* 21 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
                                this.I00iOIl++;
                                break;
                            }
                    }
/* 24 */            return null;
                }

                @Override
                public final Object previous() {
                    switch (this.I00iiO) {
                        case 0:
/* 30 */                    if (!hasPrevious()) {
/* 45 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
/* 34 */                        Object[] objArr = (Object[]) this.I00iio;
                                int i = this.I00iOIl - 1;
/* 40 */                        this.I00iOIl = i;
                                break;
                            }
                        default:
/* 10 */                    if (!hasPrevious()) {
/* 21 */                        IoOOl0iOl1io.I00000oOI();
                                break;
                            } else {
                                this.I00iOIl--;
                                break;
                            }
                    }
/* 24 */            return null;
                }
            }
