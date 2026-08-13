            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.ByteArrayInputStream;
            import java.io.InputStream;
            
/* 60 */    final class zzbog extends InputStream {
                private zzahn zza;
                private ByteArrayInputStream zzb;

                public zzbog(zzahn zzahnVar, zzahv zzahvVar) {
/* 4 */             this.zza = zzahnVar;
                }

                @Override
                public final int available() {
/* 1 */             zzahn zzahnVar = this.zza;
/* 3 */             if (zzahnVar != null) {
/* 5 */                 return zzahnVar.zzn();
                    }
/* 10 */            ByteArrayInputStream byteArrayInputStream = this.zzb;
/* 12 */            if (byteArrayInputStream != null) {
/* 14 */                return byteArrayInputStream.available();
                    }
/* 19 */            return 0;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) {
/* 1 */             zzahn zzahnVar = this.zza;
/* 4 */             if (zzahnVar != null) {
/* 6 */                 int iZzn = zzahnVar.zzn();
/* 11 */                if (iZzn == 0) {
/* 13 */                    this.zza = null;
/* 15 */                    this.zzb = null;
/* 3 */                     return -1;
                        }
/* 18 */                if (i2 >= iZzn) {
/* 20 */                    zzafm zzafmVarZzA = zzafm.zzA(bArr, i, iZzn);
/* 26 */                    this.zza.zzJ(zzafmVarZzA);
/* 29 */                    zzafmVarZzA.zzB();
/* 32 */                    this.zza = null;
/* 34 */                    this.zzb = null;
/* 36 */                    return iZzn;
                        }
/* 48 */                this.zzb = new ByteArrayInputStream(this.zza.zzl());
/* 50 */                this.zza = null;
                    }
/* 52 */            ByteArrayInputStream byteArrayInputStream = this.zzb;
/* 54 */            if (byteArrayInputStream != null) {
/* 56 */                return byteArrayInputStream.read(bArr, i, i2);
                    }
/* 3 */             return -1;
                }

                @Override
/* 61 */        public final int read() {
/* 62 */            zzahn zzahnVar = this.zza;
                    if (zzahnVar != null) {
                        this.zzb = new ByteArrayInputStream(zzahnVar.zzl());
                        this.zza = null;
                    }
                    ByteArrayInputStream byteArrayInputStream = this.zzb;
                    if (byteArrayInputStream != null) {
/* 63 */                return byteArrayInputStream.read();
                    }
                    return -1;
                }
            }
