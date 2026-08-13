            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Locale;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            
            public abstract class zzafd implements Iterable, Serializable {
                public static final zzafd zza = new zzafb(zzagp.zzb);
                private int zzb = 0;

                static {
/* 10 */            int i = zzaes.zza;
                }

                public static int zzk(int i, int i2, int i3) {
/* 3 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 98 */                return i4;
                    }
/* 11 */            if (i < 0) {
/* 48 */                I000II.I0010o(IIlIOloOOO.I00100l0("Beginning index: ", i, " < 0"));
/* 26 */                return 0;
                    }
/* 13 */            if (i2 < i) {
/* 23 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "Beginning index larger than ending index: ", ", "));
/* 26 */                return 0;
                    }
/* 36 */            I000II.I0010o(IIl001iO0Io.I000l1(i2, i3, "End index: ", " >= "));
/* 26 */            return 0;
                }

                public static zzafd zzl(byte[] bArr, int i, int i2, boolean z) {
/* 1 */             if (i2 == 0) {
/* 3 */                 return zza;
                    }
/* 9 */             zzk(i, i + i2, bArr.length);
/* 14 */            byte[] bArr2 = new byte[i2];
/* 17 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 20 */            return new zzafb(bArr2);
                }

                public static zzafd zzm(byte[] bArr, boolean z) {
                    return bArr.length == 0 ? zza : new zzafb(bArr);
                }

                public static boolean zzn(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 1 */             int i4 = i + i3;
/* 4 */             zzk(i, i4, bArr.length);
/* 9 */             zzk(i2, i3 + i2, bArr2.length);
/* 12 */            while (i < i4) {
/* 18 */                if (bArr[i] != bArr2[i2]) {
/* 20 */                    return false;
                        }
/* 22 */                i++;
/* 24 */                i2++;
                    }
/* 27 */            return true;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzafd)) {
/* 7 */                 return false;
                    }
/* 11 */            zzafd zzafdVar = (zzafd) obj;
/* 13 */            int iZze = zze();
/* 21 */            if (iZze != zzafdVar.zze()) {
/* 7 */                 return false;
                    }
/* 24 */            if (iZze == 0) {
/* 1 */                 return true;
                    }
/* 26 */            int i = this.zzb;
/* 28 */            int i2 = zzafdVar.zzb;
/* 30 */            if (i == 0 || i2 == 0 || i == i2) {
/* 37 */                return zzi(zzafdVar);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             int iZzd = this.zzb;
/* 3 */             if (iZzd == 0) {
/* 6 */                 int iZze = zze();
/* 10 */                iZzd = zzd(iZze, 0, iZze);
/* 14 */                if (iZzd == 0) {
/* 16 */                    iZzd = 1;
                        }
/* 17 */                this.zzb = iZzd;
                    }
/* 20 */            return iZzd;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return new zzaev(this);
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 57 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(zze(), "<ByteString@", hexString, " size=", " contents=\""), zze() <= 50 ? zzaik.zza(this) : zzaik.zza(zzf(0, 47)).concat("..."), "\">");
                }

                public abstract byte zza(int i);

                public abstract byte zzb(int i);

                public abstract int zzd(int i, int i2, int i3);

                public abstract int zze();

                public abstract zzafd zzf(int i, int i2);

                public abstract zzafh zzg();

                public abstract void zzh(zzaeu zzaeuVar);

                public abstract boolean zzi(zzafd zzafdVar);
            }
