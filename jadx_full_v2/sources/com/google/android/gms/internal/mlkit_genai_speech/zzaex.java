            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.Oi010OO0;
            import p000.OoOil11Ol1o;
            
            final class zzaex extends zzafa {
                private final byte[] zzb;
                private final int zzc;
                private final int zzd;

                public zzaex(byte[] bArr, int i, int i2) {
/* 2 */             super(null);
/* 8 */             zzafd.zzk(i, i + i2, bArr.length);
/* 11 */            this.zzb = bArr;
/* 13 */            this.zzc = i;
/* 15 */            this.zzd = i2;
                }

                @Override
                public final byte zza(int i) {
/* 1 */             int i2 = this.zzd;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 41 */                return this.zzb[this.zzc + i];
                    }
/* 10 */            if (i < 0) {
/* 18 */                OoOil11Ol1o.I0010I0i(Oi010OO0.I000oI1ioi(i, "Index < 0: "));
/* 21 */                return (byte) 0;
                    }
/* 31 */            OoOil11Ol1o.I0010I0i(IIl001iO0Io.I000l1(i, i2, "Index > length: ", ", "));
/* 34 */            return (byte) 0;
                }

                @Override
                public final byte zzb(int i) {
/* 6 */             return this.zzb[this.zzc + i];
                }

                @Override
                public final int zzd(int i, int i2, int i3) {
/* 5 */             return zzagp.zzb(i, this.zzb, this.zzc, i3);
                }

                @Override
                public final int zze() {
/* 1 */             return this.zzd;
                }

                @Override
                public final zzafd zzf(int i, int i2) {
/* 3 */             int iZzk = zzafd.zzk(i, i2, this.zzd);
                    return iZzk == 0 ? zzafd.zza : new zzaex(this.zzb, this.zzc + i, iZzk);
                }

                @Override
                public final zzafh zzg() {
/* 20 */            throw null;
                }

                @Override
                public final void zzh(zzaeu zzaeuVar) throws zzafk {
/* 9 */             ((zzafj) zzaeuVar).zzc(this.zzb, this.zzc, this.zzd);
                }

                @Override
                public final boolean zzi(zzafd zzafdVar) {
/* 1 */             boolean z = zzafdVar instanceof zzafb;
/* 3 */             if (!z && !(zzafdVar instanceof zzaex)) {
/* 10 */                return zzafdVar.zzi(this);
                    }
/* 15 */            int i = this.zzd;
/* 21 */            if (i > zzafdVar.zze()) {
/* 168 */               throw new IllegalArgumentException("Length too large: " + i + i);
                    }
/* 28 */            if (i > zzafdVar.zze()) {
/* 94 */                I000II.I000iOII(IIl001iO0Io.I000l1(i, zzafdVar.zze(), "Ran off end of other: 0, ", ", "));
/* 27 */                return false;
                    }
/* 30 */            if (z) {
/* 42 */                return zzafd.zzn(this.zzb, this.zzc, ((zzafb) zzafdVar).zzb, 0, i);
                    }
/* 49 */            if (zzafdVar instanceof zzaex) {
/* 51 */                zzaex zzaexVar = (zzaex) zzafdVar;
/* 61 */                return zzafd.zzn(this.zzb, this.zzc, zzaexVar.zzb, zzaexVar.zzc, i);
                    }
/* 66 */            zzafd zzafdVarZzf = zzafdVar.zzf(0, i);
/* 70 */            int i2 = this.zzc;
/* 77 */            return zzafdVarZzf.equals(zzf(i2, i + i2));
                }
            }
