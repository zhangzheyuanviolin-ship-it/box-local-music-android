            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
/* 107 */   public final class Ol1OIlllo {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final int I0000O;
                public final float I0000oI00;
                public final boolean I0001Ioi1lo;
                public final Long I000II;
                public final int I000O01llI0;
                public final boolean I000OOo1O;
                public final boolean I000OiO;
                public final int I000iOII;
                public final int I000l1;
                public final boolean I000lI;

                public Ol1OIlllo(float f, float f2, int i, Long l, int i2, boolean z, boolean z2, int i3, int i4, boolean z3, int i5) {
/* 105 */           this(0.1f, (i5 & 2) != 0 ? 0.7f : f, (i5 & 4) != 0 ? 0.9f : f2, (i5 & 8) != 0 ? 40 : i, 1.1f, true, (i5 & 64) != 0 ? null : l, (i5 & Barcode.FORMAT_QR_CODE) != 0 ? 4 : i2, (i5 & Barcode.FORMAT_UPC_A) != 0 ? true : z, (i5 & Barcode.FORMAT_UPC_E) != 0 ? false : z2, (i5 & Barcode.FORMAT_PDF417) != 0 ? 0 : i3, (i5 & Barcode.FORMAT_AZTEC) != 0 ? -1 : i4, (i5 & 8192) != 0 ? false : z3);
                }

                public static Ol1OIlllo I00000oIO(Ol1OIlllo ol1OIlllo) {
/* 28 */            return new Ol1OIlllo(ol1OIlllo.I00000oIO, ol1OIlllo.I00000oOI, ol1OIlllo.I0000Il00O, ol1OIlllo.I0000O, ol1OIlllo.I0000oI00, ol1OIlllo.I0001Ioi1lo, ol1OIlllo.I000II, ol1OIlllo.I000O01llI0, ol1OIlllo.I000OOo1O, ol1OIlllo.I000OiO, 0, ol1OIlllo.I000l1, ol1OIlllo.I000lI);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 126 */               return true;
                    }
/* 7 */             if (!(obj instanceof Ol1OIlllo)) {
/* 124 */               return false;
                    }
/* 11 */            Ol1OIlllo ol1OIlllo = (Ol1OIlllo) obj;
                    return Float.compare(this.I00000oIO, ol1OIlllo.I00000oIO) == 0 && Float.compare(this.I00000oOI, ol1OIlllo.I00000oOI) == 0 && Float.compare(this.I0000Il00O, ol1OIlllo.I0000Il00O) == 0 && this.I0000O == ol1OIlllo.I0000O && Float.compare(this.I0000oI00, ol1OIlllo.I0000oI00) == 0 && this.I0001Ioi1lo == ol1OIlllo.I0001Ioi1lo && O0000Ioio00.I0000O(this.I000II, ol1OIlllo.I000II) && this.I000O01llI0 == ol1OIlllo.I000O01llI0 && this.I000OOo1O == ol1OIlllo.I000OOo1O && this.I000OiO == ol1OIlllo.I000OiO && this.I000iOII == ol1OIlllo.I000iOII && this.I000l1 == ol1OIlllo.I000l1 && this.I000lI == ol1OIlllo.I000lI;
                }

                public final int hashCode() {
/* 36 */            int iI000OOo1O = Oi010OO0.I000OOo1O(OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.I0000O, OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31), 31, this.I0000oI00), 31, this.I0001Ioi1lo);
/* 40 */            Long l = this.I000II;
/* 89 */            return Boolean.hashCode(this.I000lI) + IIl001iO0Io.I0000O(this.I000l1, IIl001iO0Io.I0000O(this.I000iOII, Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I000O01llI0, (iI000OOo1O + (l == null ? 0 : l.hashCode())) * 961, 31), 31, this.I000OOo1O), 31, this.I000OiO), 31), 31);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("InferenceParams(minP=", this.I00000oIO, ", temperature=", this.I00000oOI, ", topP=");
/* 17 */            sbI00100l0.append(this.I0000Il00O);
/* 22 */            sbI00100l0.append(", topK=");
/* 27 */            sbI00100l0.append(this.I0000O);
/* 32 */            sbI00100l0.append(", repeatPenalty=");
/* 37 */            sbI00100l0.append(this.I0000oI00);
/* 42 */            sbI00100l0.append(", storeChats=");
/* 47 */            sbI00100l0.append(this.I0001Ioi1lo);
/* 52 */            sbI00100l0.append(", contextSize=");
/* 57 */            sbI00100l0.append(this.I000II);
/* 62 */            sbI00100l0.append(", chatTemplate=null, numThreads=");
/* 67 */            sbI00100l0.append(this.I000O01llI0);
/* 72 */            sbI00100l0.append(", useMmap=");
/* 77 */            sbI00100l0.append(this.I000OOo1O);
/* 82 */            sbI00100l0.append(", useMlock=");
/* 87 */            sbI00100l0.append(this.I000OiO);
/* 92 */            sbI00100l0.append(", nGpuLayers=");
/* 97 */            sbI00100l0.append(this.I000iOII);
/* 102 */           sbI00100l0.append(", numThreadsBatch=");
/* 107 */           sbI00100l0.append(this.I000l1);
/* 112 */           sbI00100l0.append(", kvCacheQ8=");
/* 119 */           return IIlIOloOOO.I0010o(sbI00100l0, this.I000lI, ")");
                }

/* 108 */       public Ol1OIlllo(float f, float f2, float f3, int i, float f4, boolean z, Long l, int i2, boolean z2, boolean z3, int i3, int i4, boolean z4) {
/* 110 */           this.I00000oIO = f;
/* 111 */           this.I00000oOI = f2;
/* 112 */           this.I0000Il00O = f3;
/* 113 */           this.I0000O = i;
/* 114 */           this.I0000oI00 = f4;
/* 115 */           this.I0001Ioi1lo = z;
/* 116 */           this.I000II = l;
/* 117 */           this.I000O01llI0 = i2;
/* 118 */           this.I000OOo1O = z2;
/* 119 */           this.I000OiO = z3;
/* 120 */           this.I000iOII = i3;
/* 121 */           this.I000l1 = i4;
/* 122 */           this.I000lI = z4;
                }
            }
