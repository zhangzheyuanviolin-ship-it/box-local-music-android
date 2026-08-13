            package com.google.android.play.core.assetpacks;

            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import p000.IIl001iO0Io;
            import p000.IOOlIIilOl0;
            import p000.i0Iilo0;
            import p000.i0O0oOiO11;
            import p000.i0OI1IOoili1;
            import p000.liIlli0IIoo;
            
            public final class bs {
                public String I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public String I000O01llI0;
                public String I000OOo1O;

                public static bs I00000oIO(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
/* 10 */            int iRint = (int) Math.rint(d * 100.0d);
/* 11 */            bs bsVar = new bs();
/* 15 */            if (str == null) {
/* 57 */                IOOlIIilOl0.I000II("Null name");
/* 14 */                return null;
                    }
/* 17 */            bsVar.I00000oIO = str;
/* 19 */            bsVar.I00000oOI = i;
/* 21 */            bsVar.I0000Il00O = i2;
/* 23 */            bsVar.I0000O = j;
/* 25 */            bsVar.I0000oI00 = j2;
/* 27 */            bsVar.I0001Ioi1lo = iRint;
/* 29 */            bsVar.I000II = i3;
/* 31 */            if (str2 == null) {
/* 51 */                IOOlIIilOl0.I000II("Null availableVersionTag");
/* 14 */                return null;
                    }
/* 33 */            bsVar.I000O01llI0 = str2;
/* 35 */            if (str3 == null) {
/* 45 */                IOOlIIilOl0.I000II("Null installedVersionTag");
/* 14 */                return null;
                    }
/* 37 */            bsVar.I000OOo1O = str3;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            return bsVar;
                }

                public static bs I00000oOI(Bundle bundle, String str, i0O0oOiO11 i0o0ooio11, i0OI1IOoili1 i0oi1iooili1, i0Iilo0 i0iilo0) {
/* 17 */            int iI0000Il00O = i0iilo0.I0000Il00O(bundle.getInt(liIlli0IIoo.I00000oIO("status", str)));
/* 27 */            int i = bundle.getInt(liIlli0IIoo.I00000oIO("error_code", str));
/* 37 */            long j = bundle.getLong(liIlli0IIoo.I00000oIO("bytes_downloaded", str));
/* 47 */            long j2 = bundle.getLong(liIlli0IIoo.I00000oIO("total_bytes_to_download", str));
/* 53 */            double dI00000oIO = i0o0ooio11.I00000oIO(str);
/* 63 */            long j3 = bundle.getLong(liIlli0IIoo.I00000oIO("pack_version", str));
/* 73 */            long j4 = bundle.getLong(liIlli0IIoo.I00000oIO("pack_base_version", str));
/* 77 */            int i2 = 1;
/* 79 */            if (iI0000Il00O == 4) {
/* 85 */                if (j4 != 0 && j4 != j3) {
/* 91 */                    i2 = 2;
                        }
/* 92 */                iI0000Il00O = 4;
                    }
/* 126 */           return I00000oIO(str, iI0000Il00O, i, j, j2, dI00000oIO, i2, bundle.getString(liIlli0IIoo.I00000oIO("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), i0oi1iooili1.I00000oIO(str));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof bs) {
/* 10 */                bs bsVar = (bs) obj;
/* 20 */                if (this.I00000oIO.equals(bsVar.I00000oIO) && this.I00000oOI == bsVar.I00000oOI && this.I0000Il00O == bsVar.I0000Il00O && this.I0000O == bsVar.I0000O && this.I0000oI00 == bsVar.I0000oI00 && this.I0001Ioi1lo == bsVar.I0001Ioi1lo && this.I000II == bsVar.I000II && this.I000O01llI0.equals(bsVar.I000O01llI0) && this.I000OOo1O.equals(bsVar.I000OOo1O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            long j = this.I0000oI00;
/* 13 */            String str = this.I000O01llI0;
/* 20 */            long j2 = this.I0000O;
/* 53 */            int iHashCode2 = (((((((((((((iHashCode * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.I0001Ioi1lo) * 1000003) ^ this.I000II) * 1000003) ^ str.hashCode();
/* 61 */            return this.I000OOo1O.hashCode() ^ (iHashCode2 * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AssetPackState{name=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", status=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", errorCode=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", bytesDownloaded=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", totalBytesToDownload=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", transferProgressPercentage=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", updateAvailability=");
/* 70 */            sb.append(this.I000II);
/* 75 */            sb.append(", availableVersionTag=");
/* 80 */            sb.append(this.I000O01llI0);
/* 85 */            sb.append(", installedVersionTag=");
/* 92 */            return IIl001iO0Io.I00100l0(sb, this.I000OOo1O, "}");
                }
            }
