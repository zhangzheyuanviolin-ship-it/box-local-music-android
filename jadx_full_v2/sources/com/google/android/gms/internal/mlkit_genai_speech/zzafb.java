            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import p000.I000II;
            import p000.IIl001iO0Io;
            
            final class zzafb extends zzafa {
                private final byte[] zzb;

                public zzafb(byte[] bArr) {
/* 2 */             super(null);
/* 5 */             bArr.getClass();
/* 8 */             this.zzb = bArr;
                }

                @Override
                public final byte zza(int i) {
/* 3 */             return this.zzb[i];
                }

                @Override
                public final byte zzb(int i) {
/* 3 */             return this.zzb[i];
                }

                @Override
                public final int zzd(int i, int i2, int i3) {
/* 4 */             return zzagp.zzb(i, this.zzb, 0, i3);
                }

                @Override
                public final int zze() {
/* 3 */             return this.zzb.length;
                }

                @Override
                public final zzafd zzf(int i, int i2) {
/* 1 */             byte[] bArr = this.zzb;
/* 5 */             int iZzk = zzafd.zzk(0, i2, bArr.length);
                    return iZzk == 0 ? zzafd.zza : new zzaex(bArr, 0, iZzk);
                }

                @Override
                public final zzafh zzg() {
/* 1 */             byte[] bArr = this.zzb;
/* 6 */             return zzafh.zzK(bArr, 0, bArr.length, true);
                }

                @Override
                public final void zzh(zzaeu zzaeuVar) throws zzafk {
/* 3 */             byte[] bArr = this.zzb;
/* 7 */             ((zzafj) zzaeuVar).zzc(bArr, 0, bArr.length);
                }

                @Override
                public final boolean zzi(zzafd zzafdVar) {
/* 1 */             boolean z = zzafdVar instanceof zzafb;
/* 3 */             if (z) {
/* 11 */                return Arrays.equals(this.zzb, ((zzafb) zzafdVar).zzb);
                    }
/* 16 */            boolean z2 = zzafdVar instanceof zzaex;
/* 18 */            if (!z2) {
/* 116 */               return zzafdVar.zzi(this);
                    }
/* 20 */            byte[] bArr = this.zzb;
/* 22 */            int iZze = zzafdVar.zze();
/* 26 */            int length = bArr.length;
/* 27 */            if (length > iZze) {
/* 115 */               throw new IllegalArgumentException("Length too large: " + length + length);
                    }
/* 34 */            if (length > zzafdVar.zze()) {
/* 89 */                I000II.I000iOII(IIl001iO0Io.I000l1(length, zzafdVar.zze(), "Ran off end of other: 0, ", ", "));
/* 33 */                return false;
                    }
/* 36 */            if (z) {
/* 42 */                return zzafd.zzn(bArr, 0, ((zzafb) zzafdVar).zzb, 0, length);
                    }
/* 47 */            if (!z2) {
/* 72 */                return zzafdVar.zzf(0, length).equals(zzf(0, length));
                    }
/* 49 */            zzaex zzaexVar = (zzaex) zzafdVar;
/* 59 */            return zzafd.zzn(bArr, 0, zzaexVar.zzb, zzaexVar.zzc, length);
                }
            }
