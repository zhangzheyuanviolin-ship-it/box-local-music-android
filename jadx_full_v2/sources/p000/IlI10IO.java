            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.List;
            
            public final class IlI10IO {
                public final IlI0olO00l0l I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;
                public final List I0000oI00;
                public final List I0001Ioi1lo;
                public final List I000II;
                public final float I000O01llI0;
                public final boolean I000OOo1O;
                public final boolean I000OiO;
                public final boolean I000iOII;

                public IlI10IO(IlI0olO00l0l ilI0olO00l0l, boolean z, String str, String str2, List list, List list2, List list3, float f, boolean z2, boolean z3, boolean z4) {
/* 4 */             this.I00000oIO = ilI0olO00l0l;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = str2;
/* 12 */            this.I0000oI00 = list;
/* 14 */            this.I0001Ioi1lo = list2;
/* 16 */            this.I000II = list3;
/* 18 */            this.I000O01llI0 = f;
/* 20 */            this.I000OOo1O = z2;
/* 22 */            this.I000OiO = z3;
/* 24 */            this.I000iOII = z4;
                }

                public static IlI10IO I00000oIO(IlI10IO ilI10IO, IlI0olO00l0l ilI0olO00l0l, boolean z, String str, String str2, List list, List list2, List list3, float f, boolean z2, boolean z3, boolean z4, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 ilI0olO00l0l = ilI10IO.I00000oIO;
                    }
/* 9 */             IlI0olO00l0l ilI0olO00l0l2 = ilI0olO00l0l;
/* 12 */            if ((i & 2) != 0) {
/* 14 */                z = ilI10IO.I00000oOI;
                    }
/* 16 */            boolean z5 = z;
/* 19 */            if ((i & 4) != 0) {
/* 21 */                str = ilI10IO.I0000Il00O;
                    }
/* 23 */            String str3 = str;
/* 32 */            String str4 = (i & 8) != 0 ? ilI10IO.I0000O : str2;
/* 42 */            List list4 = (i & 16) != 0 ? ilI10IO.I0000oI00 : list;
/* 52 */            List list5 = (i & 32) != 0 ? ilI10IO.I0001Ioi1lo : list2;
/* 62 */            List list6 = (i & 64) != 0 ? ilI10IO.I000II : list3;
/* 72 */            float f2 = (i & Barcode.FORMAT_ITF) != 0 ? ilI10IO.I000O01llI0 : f;
/* 82 */            boolean z6 = (i & Barcode.FORMAT_QR_CODE) != 0 ? ilI10IO.I000OOo1O : z2;
/* 92 */            boolean z7 = (i & Barcode.FORMAT_UPC_A) != 0 ? ilI10IO.I000OiO : z3;
/* 102 */           boolean z8 = (i & Barcode.FORMAT_UPC_E) != 0 ? ilI10IO.I000iOII : z4;
/* 104 */           ilI10IO.getClass();
/* 109 */           return new IlI10IO(ilI0olO00l0l2, z5, str3, str4, list4, list5, list6, f2, z6, z7, z8);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IlI10IO)) {
/* 7 */                 return false;
                    }
/* 11 */            IlI10IO ilI10IO = (IlI10IO) obj;
                    return this.I00000oIO == ilI10IO.I00000oIO && this.I00000oOI == ilI10IO.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, ilI10IO.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ilI10IO.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, ilI10IO.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, ilI10IO.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, ilI10IO.I000II) && Float.compare(this.I000O01llI0, ilI10IO.I000O01llI0) == 0 && this.I000OOo1O == ilI10IO.I000OOo1O && this.I000OiO == ilI10IO.I000OiO && this.I000iOII == ilI10IO.I000iOII;
                }

                public final int hashCode() {
/* 12 */            int iI000OOo1O = Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 17 */            String str = this.I0000Il00O;
/* 28 */            int iHashCode = (iI000OOo1O + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            String str2 = this.I0000O;
/* 82 */            return Boolean.hashCode(this.I000iOII) + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(OooioIOo1.I0000O(IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000oI00((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0), 31, this.I000OOo1O), 31, this.I000OiO);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FaceRecUiState(tab=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", isProcessing=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", error=");
/* 36 */            IIl001iO0Io.I001lIiIIo1O(sb, this.I0000Il00O, ", statusMessage=", this.I0000O, ", recognizeResults=");
/* 41 */            sb.append(this.I0000oI00);
/* 46 */            sb.append(", pendingFaces=");
/* 51 */            sb.append(this.I0001Ioi1lo);
/* 56 */            sb.append(", enrolled=");
/* 61 */            sb.append(this.I000II);
/* 66 */            sb.append(", threshold=");
/* 71 */            sb.append(this.I000O01llI0);
/* 76 */            sb.append(", frontCamera=");
/* 81 */            sb.append(this.I000OOo1O);
/* 86 */            sb.append(", showPercent=");
/* 91 */            sb.append(this.I000OiO);
/* 96 */            sb.append(", showMesh=");
/* 103 */           return IIlIOloOOO.I0010o(sb, this.I000iOII, ")");
                }
            }
