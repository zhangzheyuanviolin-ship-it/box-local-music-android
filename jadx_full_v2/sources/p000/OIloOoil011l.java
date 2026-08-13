            package p000;

            import java.util.Arrays;
            
/* 87 */    public final class OIloOoil011l implements IIi0O1OOO1i0 {
                public static final OIloOoil011l I00iiI = new OIloOoil011l(612.0f, 792.0f);
                public final IIOoIilO I00iOIl;

                static {
/* 16 */            new OIloOoil011l(612.0f, 1008.0f);
/* 27 */            new OIloOoil011l(2383.937f, 3370.3938f);
/* 35 */            new OIloOoil011l(1683.7795f, 2383.937f);
/* 43 */            new OIloOoil011l(1190.5513f, 1683.7795f);
/* 51 */            new OIloOoil011l(841.8898f, 1190.5513f);
/* 59 */            new OIloOoil011l(595.27563f, 841.8898f);
/* 67 */            new OIloOoil011l(419.52756f, 595.27563f);
/* 75 */            new OIloOoil011l(297.63782f, 419.52756f);
                }

                public OIloOoil011l(IIOoIilO iIOoIilO) {
/* 9 */             float[] fArrCopyOf = Arrays.copyOf(iIOoIilO.I00oo1iO0ll(), 4);
/* 15 */            IIOoIilO iIOoIilO2 = new IIOoIilO();
/* 18 */            this.I00iOIl = iIOoIilO2;
/* 35 */            iIOoIilO2.I00ioIO(new IIOolo0l(Math.min(fArrCopyOf[0], fArrCopyOf[2])));
/* 53 */            iIOoIilO2.I00ioIO(new IIOolo0l(Math.min(fArrCopyOf[1], fArrCopyOf[3])));
/* 69 */            iIOoIilO2.I00ioIO(new IIOolo0l(Math.max(fArrCopyOf[0], fArrCopyOf[2])));
/* 85 */            iIOoIilO2.I00ioIO(new IIOolo0l(Math.max(fArrCopyOf[1], fArrCopyOf[3])));
                }

                public final float I00000oIO() {
/* 10 */            return ((IIi0IoOo) this.I00iOIl.I00l0I0l0lO1(0)).I00ioIO();
                }

                public final float I00000oOI() {
/* 10 */            return ((IIi0IoOo) this.I00iOIl.I00l0I0l0lO1(1)).I00ioIO();
                }

                public final float I0000Il00O() {
/* 10 */            return ((IIi0IoOo) this.I00iOIl.I00l0I0l0lO1(2)).I00ioIO();
                }

                public final float I0000O() {
/* 10 */            return ((IIi0IoOo) this.I00iOIl.I00l0I0l0lO1(3)).I00ioIO();
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                public final String toString() {
/* 52 */            return "[" + I00000oIO() + "," + I00000oOI() + "," + I0000Il00O() + "," + I0000O() + "]";
                }

/* 88 */        public OIloOoil011l(float f, float f2, float f3, float f4) {
/* 90 */            IIOoIilO iIOoIilO = new IIOoIilO();
                    this.I00iOIl = iIOoIilO;
/* 91 */            iIOoIilO.I00ioIO(new IIOolo0l(f));
/* 92 */            iIOoIilO.I00ioIO(new IIOolo0l(f2));
/* 93 */            iIOoIilO.I00ioIO(new IIOolo0l(f + f3));
/* 94 */            iIOoIilO.I00ioIO(new IIOolo0l(f2 + f4));
                }

/* 94 */        public OIloOoil011l(float f, float f2) {
/* 95 */            this(0.0f, 0.0f, f, f2);
                }
            }
