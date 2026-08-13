            package p000;

            import android.util.Log;
            import java.io.EOFException;
            
            public final class OIOi01l extends OlliIl0 {
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public byte[] I000OOo1O;
                public long I000OiO;
                public long I000iOII;

                @Override
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) throws EOFException {
/* 5 */             this.I0001Ioi1lo = ioiOloi.I00OIl();
/* 7 */             ioiOloi.I00IioO0OiOi();
/* 14 */            this.I000II = ioiOloi.I00OIl();
/* 16 */            ioiOloi.I00OIl();
/* 19 */            ioiOloi.I00IioO0OiOi();
/* 22 */            ioiOloi.I00IioO0OiOi();
/* 25 */            ioiOloi.I00IioO0OiOi();
/* 28 */            ioiOloi.I00IioO0OiOi();
/* 31 */            ioiOloi.I00IioO0OiOi();
/* 34 */            ioiOloi.I00IioO0OiOi();
/* 37 */            ioiOloi.I00IioO0OiOi();
/* 40 */            ioiOloi.I00IioO0OiOi();
/* 43 */            ioiOloi.I00IioO0OiOi();
/* 46 */            ioiOloi.I00IioO0OiOi();
/* 49 */            ioiOloi.I00IioO0OiOi();
/* 56 */            this.I000O01llI0 = ioiOloi.I00IioO0OiOi();
/* 64 */            this.I000OOo1O = ioiOloi.I00100l0(10);
/* 66 */            ioiOloi.I00IoiI();
/* 69 */            ioiOloi.I00IoiI();
/* 72 */            ioiOloi.I00IoiI();
/* 75 */            ioiOloi.I00IoiI();
/* 81 */            ioiOloi.I00Io1lO(4, IO1IOO01oiO.I00000oIO);
/* 84 */            ioiOloi.I00OIl();
/* 87 */            ioiOloi.I00OIl();
/* 90 */            ioiOloi.I00OIl();
                    try {
/* 94 */                ioiOloi.I00IioO0OiOi();
/* 97 */                ioiOloi.I00IioO0OiOi();
/* 100 */               ioiOloi.I00IioO0OiOi();
/* 103 */               ioiOloi.I00OIl();
/* 106 */               ioiOloi.I00OIl();
/* 113 */               if (this.I0001Ioi1lo >= 1) {
                            try {
/* 119 */                       this.I000OiO = ioiOloi.I00IoiI();
/* 125 */                       this.I000iOII = ioiOloi.I00IoiI();
                            } catch (EOFException e) {
/* 130 */                       this.I0001Ioi1lo = 0;
/* 134 */                       Log.w("PdfBox-Android", "Could not read all expected parts of version >= 1, setting version to 0", e);
/* 137 */                       this.I0000O = true;
/* 139 */                       return;
                            }
                        }
/* 143 */               if (this.I0001Ioi1lo >= 2) {
                            try {
/* 145 */                       ioiOloi.I00IioO0OiOi();
/* 148 */                       ioiOloi.I00IioO0OiOi();
/* 151 */                       ioiOloi.I00OIl();
/* 154 */                       ioiOloi.I00OIl();
/* 157 */                       ioiOloi.I00OIl();
                            } catch (EOFException e2) {
/* 162 */                       this.I0001Ioi1lo = 1;
/* 166 */                       Log.w("PdfBox-Android", "Could not read all expected parts of version >= 2, setting version to 1", e2);
/* 169 */                       this.I0000O = true;
/* 171 */                       return;
                            }
                        }
/* 172 */               this.I0000O = true;
                    } catch (EOFException unused) {
/* 175 */               this.I0000O = true;
                    }
                }
            }
