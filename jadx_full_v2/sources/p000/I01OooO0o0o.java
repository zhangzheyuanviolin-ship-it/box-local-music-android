            package p000;

            import java.util.Arrays;
            
            public abstract class I01OooO0o0o {
                public I01i000i0iI[] I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public OliO0olIi I00iio;

                public final I01i000i0iI I0000O() {
                    I01i000i0iI i01i000i0iII000II;
                    OliO0olIi oliO0olIi;
                    synchronized (this) {
                        try {
/* 2 */                     I01i000i0iI[] i01i000i0iIArrI000O01llI0 = this.I00iOIl;
/* 4 */                     if (i01i000i0iIArrI000O01llI0 == null) {
/* 6 */                         i01i000i0iIArrI000O01llI0 = I000O01llI0();
/* 10 */                        this.I00iOIl = i01i000i0iIArrI000O01llI0;
                            } else if (this.I00iiI >= i01i000i0iIArrI000O01llI0.length) {
/* 23 */                        Object[] objArrCopyOf = Arrays.copyOf(i01i000i0iIArrI000O01llI0, i01i000i0iIArrI000O01llI0.length * 2);
/* 30 */                        this.I00iOIl = (I01i000i0iI[]) objArrCopyOf;
/* 32 */                        i01i000i0iIArrI000O01llI0 = (I01i000i0iI[]) objArrCopyOf;
                            }
/* 34 */                    int i = this.I00iiO;
/* 56 */                    do {
/* 36 */                        i01i000i0iII000II = i01i000i0iIArrI000O01llI0[i];
/* 38 */                        if (i01i000i0iII000II == null) {
/* 40 */                            i01i000i0iII000II = I000II();
/* 44 */                            i01i000i0iIArrI000O01llI0[i] = i01i000i0iII000II;
                                }
/* 46 */                        i++;
/* 49 */                        if (i >= i01i000i0iIArrI000O01llI0.length) {
/* 51 */                            i = 0;
                                }
/* 56 */                    } while (!i01i000i0iII000II.I00000oIO(this));
/* 58 */                    this.I00iiO = i;
                            this.I00iiI++;
/* 66 */                    oliO0olIi = this.I00iio;
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
/* 69 */            if (oliO0olIi != null) {
/* 71 */                oliO0olIi.I001i1lo1io(1);
                    }
/* 74 */            return i01i000i0iII000II;
                }

                public abstract I01i000i0iI I000II();

                public abstract I01i000i0iI[] I000O01llI0();

                public final void I000OOo1O(I01i000i0iI i01i000i0iI) {
                    OliO0olIi oliO0olIi;
                    int i;
                    IOoil1iiIilo[] iOoil1iiIiloArrI00000oOI;
                    synchronized (this) {
                        try {
                            int i2 = this.I00iiI - 1;
/* 6 */                     this.I00iiI = i2;
/* 8 */                     oliO0olIi = this.I00iio;
/* 11 */                    if (i2 == 0) {
/* 13 */                        this.I00iiO = 0;
                            }
/* 18 */                    iOoil1iiIiloArrI00000oOI = i01i000i0iI.I00000oOI(this);
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
/* 24 */            for (IOoil1iiIilo iOoil1iiIilo : iOoil1iiIiloArrI00000oOI) {
/* 28 */                if (iOoil1iiIilo != null) {
/* 32 */                    iOoil1iiIilo.resumeWith(OoiIlOl1iI.I00000oIO);
                        }
                    }
/* 38 */            if (oliO0olIi != null) {
/* 40 */                oliO0olIi.I001i1lo1io(-1);
                    }
                }

                public final OliO0olIi I000OiO() {
                    OliO0olIi oliO0olIi;
                    synchronized (this) {
/* 2 */                 oliO0olIi = this.I00iio;
/* 4 */                 if (oliO0olIi == null) {
/* 8 */                     int i = this.I00iiI;
/* 16 */                    oliO0olIi = new OliO0olIi(1, Integer.MAX_VALUE, IIII0i.I00iiI);
/* 23 */                    oliO0olIi.I0001Ioi1lo(Integer.valueOf(i));
/* 26 */                    this.I00iio = oliO0olIi;
                        }
                    }
/* 32 */            return oliO0olIi;
                }
            }
