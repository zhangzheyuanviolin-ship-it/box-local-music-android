            package p000;

            import java.io.IOException;
            
/* 12 */    public final class OlilIiOO extends OlilO10IOi0o {
                public final int I00iio;
                public Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlilIiOO(Olil0l0 olil0l0, String str) {
/* 4 */             super(olil0l0, str);
/* 2 */             this.I00iio = 1;
/* 11 */            this.I00ilI0I1 = olil0l0.I001iOo1i0O(str);
                }

                @Override
                public final void I000OOo1O(int i, double d) {
                    switch (this.I00iio) {
                        case 0:
/* 33 */                    ((OlilIol) this.I00ilI0I1).I000OOo1O(i, d);
/* 36 */                    return;
                        case 1:
/* 18 */                    I00000oIO();
/* 25 */                    ((OlilOOI) this.I00ilI0I1).I000OOo1O(i, d);
/* 28 */                    return;
                        default:
/* 6 */                     I00000oIO();
/* 13 */                    lO0I01oIl1o.I00000oIO(25, "column index out of range");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final void I000OiO(int i, long j) {
                    switch (this.I00iio) {
                        case 0:
/* 33 */                    ((OlilIol) this.I00ilI0I1).I000OiO(i, j);
/* 36 */                    return;
                        case 1:
/* 18 */                    I00000oIO();
/* 25 */                    ((OlilOOI) this.I00ilI0I1).I000OiO(i, j);
/* 28 */                    return;
                        default:
/* 6 */                     I00000oIO();
/* 13 */                    lO0I01oIl1o.I00000oIO(25, "column index out of range");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final void I000iOII(int i, byte[] bArr) {
                    switch (this.I00iio) {
                        case 0:
/* 33 */                    ((OlilIol) this.I00ilI0I1).I000iOII(i, bArr);
/* 36 */                    return;
                        case 1:
/* 18 */                    I00000oIO();
/* 25 */                    ((OlilOOI) this.I00ilI0I1).I000iOII(i, bArr);
/* 28 */                    return;
                        default:
/* 6 */                     I00000oIO();
/* 13 */                    lO0I01oIl1o.I00000oIO(25, "column index out of range");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final void I000o00OoI0I(int i) {
                    switch (this.I00iio) {
                        case 0:
/* 33 */                    ((OlilIol) this.I00ilI0I1).I000o00OoI0I(i);
/* 36 */                    return;
                        case 1:
/* 18 */                    I00000oIO();
/* 25 */                    ((OlilOOI) this.I00ilI0I1).I000o00OoI0I(i);
/* 28 */                    return;
                        default:
/* 6 */                     I00000oIO();
/* 13 */                    lO0I01oIl1o.I00000oIO(25, "column index out of range");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final void I00Io1o110i(int i, String str) {
                    switch (this.I00iio) {
                        case 0:
/* 33 */                    ((OlilIol) this.I00ilI0I1).I00Io1o110i(i, str);
/* 36 */                    return;
                        case 1:
/* 18 */                    I00000oIO();
/* 25 */                    ((OlilOOI) this.I00ilI0I1).I001i1O0Ol(i, str);
/* 28 */                    return;
                        default:
/* 6 */                     I00000oIO();
/* 13 */                    lO0I01oIl1o.I00000oIO(25, "column index out of range");
/* 17 */                    throw null;
                    }
                }

                @Override
                public boolean I00O0i0ii() {
                    switch (this.I00iio) {
                        case 0:
/* 15 */                    return ((OlilIol) this.I00ilI0I1).I00O0i0ii();
                        default:
/* 6 */                     return super.I00O0i0ii();
                    }
                }

                @Override
                public final String I00i0O(int i) {
                    switch (this.I00iio) {
                        case 0:
/* 29 */                    return ((OlilIol) this.I00ilI0I1).I00i0O(i);
                        case 1:
/* 18 */                    I00000oIO();
/* 21 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 24 */                    throw null;
                        default:
/* 11 */                    I00000oIO();
/* 14 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final boolean I00ol1() {
/* 1 */             int i = this.I00iio;
/* 3 */             Olil0l0 olil0l0 = this.I00iOIl;
                    switch (i) {
                        case 0:
/* 71 */                    OlilIol olilIol = (OlilIol) this.I00ilI0I1;
/* 73 */                    boolean zI00ol1 = olilIol.I00ol1();
/* 87 */                    if (!olilIol.I00i0O(0).equalsIgnoreCase("wal")) {
/* 93 */                        olil0l0.I001IIilI0O();
                                break;
                            } else {
/* 89 */                        olil0l0.I00Iooi00oi();
                                break;
                            }
                        case 1:
/* 58 */                    I00000oIO();
/* 65 */                    ((OlilOOI) this.I00ilI0I1).I000oI1ioi();
                            break;
                        default:
/* 13 */                    int iOrdinal = ((OlilIOi1ooi) this.I00ilI0I1).ordinal();
/* 17 */                    if (iOrdinal == 0) {
/* 51 */                        olil0l0.I00O10llo();
/* 54 */                        olil0l0.I00OloOo();
                                break;
                            } else if (iOrdinal == 1) {
/* 47 */                        olil0l0.I00OloOo();
                                break;
                            } else if (iOrdinal == 2) {
/* 43 */                        olil0l0.I0010o();
                                break;
                            } else if (iOrdinal == 3) {
/* 39 */                        olil0l0.I00OI1();
                                break;
                            } else if (iOrdinal != 4) {
/* 35 */                        I000II.I00000oIO();
                                break;
                            } else {
/* 31 */                        olil0l0.I001lloI();
                                break;
                            }
                    }
/* 5 */             return false;
                }

                @Override
                public final void close() throws IOException {
                    switch (this.I00iio) {
                        case 0:
/* 25 */                    ((OlilIol) this.I00ilI0I1).close();
                            break;
                        case 1:
/* 14 */                    ((OlilOOI) this.I00ilI0I1).close();
/* 18 */                    this.I00iiO = true;
                            break;
                        default:
/* 7 */                     this.I00iiO = true;
                            break;
                    }
                }

                @Override
                public final byte[] getBlob(int i) {
                    switch (this.I00iio) {
                        case 0:
/* 29 */                    return ((OlilIol) this.I00ilI0I1).getBlob(i);
                        case 1:
/* 18 */                    I00000oIO();
/* 21 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 24 */                    throw null;
                        default:
/* 11 */                    I00000oIO();
/* 14 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final int getColumnCount() {
                    switch (this.I00iio) {
                        case 0:
                            break;
                        case 1:
/* 11 */                    I00000oIO();
                            break;
                        default:
/* 6 */                     I00000oIO();
                            break;
                    }
/* 9 */             return 0;
                }

                @Override
                public final String getColumnName(int i) {
                    switch (this.I00iio) {
                        case 0:
/* 29 */                    return ((OlilIol) this.I00ilI0I1).getColumnName(i);
                        case 1:
/* 18 */                    I00000oIO();
/* 21 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 24 */                    throw null;
                        default:
/* 11 */                    I00000oIO();
/* 14 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final long getLong(int i) {
                    switch (this.I00iio) {
                        case 0:
/* 34 */                    return ((OlilIol) this.I00ilI0I1).getLong(i);
                        case 1:
/* 18 */                    I00000oIO();
/* 25 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 29 */                    throw null;
                        default:
/* 6 */                     I00000oIO();
/* 13 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 17 */                    throw null;
                    }
                }

                @Override
                public final boolean isNull(int i) {
                    switch (this.I00iio) {
                        case 0:
/* 34 */                    return ((OlilIol) this.I00ilI0I1).isNull(i);
                        case 1:
/* 18 */                    I00000oIO();
/* 25 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 29 */                    throw null;
                        default:
/* 6 */                     I00000oIO();
/* 13 */                    lO0I01oIl1o.I00000oIO(21, "no row");
/* 17 */                    throw null;
                    }
                }

                @Override
                public void reset() {
                    switch (this.I00iio) {
                        case 0:
/* 14 */                    ((OlilIol) this.I00ilI0I1).reset();
                            break;
                        default:
/* 6 */                     super.reset();
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public OlilIiOO(Olil0l0 olil0l0, String str, int i) {
                    super(olil0l0, str);
/* 14 */            this.I00iio = i;
                }
            }
