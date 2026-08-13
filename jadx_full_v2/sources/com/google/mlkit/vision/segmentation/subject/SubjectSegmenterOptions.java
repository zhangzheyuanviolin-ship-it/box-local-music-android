            package com.google.mlkit.vision.segmentation.subject;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.concurrent.Executor;
            import p000.l1ioii1I10Io;
            import p000.lloolOoi;
            
            public class SubjectSegmenterOptions {
                private final boolean zza;
                private final boolean zzb;
                private final boolean zzc;
                private final boolean zzd;
                private final boolean zze;
                private final Executor zzf;

                public static class Builder {
                    private boolean zza = false;
                    private boolean zzb = false;
                    private boolean zzc = false;
                    private boolean zzd = false;
                    private boolean zze = false;
                    private Executor zzf;

                    public SubjectSegmenterOptions build() {
/* 4 */                 return new SubjectSegmenterOptions(this, null);
                    }

                    public Builder enableForegroundBitmap() {
/* 2 */                 this.zzb = true;
/* 29 */                return this;
                    }

                    public Builder enableForegroundConfidenceMask() {
/* 2 */                 this.zza = true;
/* 29 */                return this;
                    }

                    public Builder enableMultipleSubjects(SubjectResultOptions subjectResultOptions) {
/* 2 */                 this.zzc = true;
/* 8 */                 this.zzd = subjectResultOptions.zza;
/* 14 */                this.zze = subjectResultOptions.zzb;
/* 49 */                return this;
                    }

                    public Builder setExecutor(Executor executor) {
/* 1 */                 this.zzf = executor;
/* 49 */                return this;
                    }
                }

                public static class SubjectResultOptions {
                    private boolean zza;
                    private boolean zzb;

                    public static class Builder {
                        private boolean zza = false;
                        private boolean zzb = false;

                        public SubjectResultOptions build() {
/* 4 */                     return new SubjectResultOptions(this, null);
                        }

                        public Builder enableConfidenceMask() {
/* 2 */                     this.zza = true;
/* 29 */                    return this;
                        }

                        public Builder enableSubjectBitmap() {
/* 2 */                     this.zzb = true;
/* 29 */                    return this;
                        }
                    }

                    public SubjectResultOptions(Builder builder, zza zzaVar) {
/* 5 */                 this.zza = false;
/* 7 */                 this.zzb = false;
/* 13 */                this.zza = builder.zza;
/* 19 */                this.zzb = builder.zzb;
                    }

                    public boolean equals(Object obj) {
/* 2 */                 if (obj == this) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(obj instanceof SubjectResultOptions)) {
/* 7 */                     return false;
                        }
/* 11 */                SubjectResultOptions subjectResultOptions = (SubjectResultOptions) obj;
                        return this.zza == subjectResultOptions.zza && this.zzb == subjectResultOptions.zzb;
                    }

                    public int hashCode() {
/* 17 */                return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb)});
                    }
                }

                public SubjectSegmenterOptions(Builder builder, zzb zzbVar) {
/* 8 */             this.zza = builder.zza;
/* 14 */            this.zzb = builder.zzb;
/* 20 */            this.zzc = builder.zzc;
/* 26 */            this.zzd = builder.zzd;
/* 32 */            this.zze = builder.zze;
/* 38 */            this.zzf = builder.zzf;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SubjectSegmenterOptions)) {
/* 7 */                 return false;
                    }
/* 11 */            SubjectSegmenterOptions subjectSegmenterOptions = (SubjectSegmenterOptions) obj;
                    return this.zza == subjectSegmenterOptions.zza && this.zzb == subjectSegmenterOptions.zzb && this.zzc == subjectSegmenterOptions.zzc && this.zzd == subjectSegmenterOptions.zzd && this.zze == subjectSegmenterOptions.zze && l1ioii1I10Io.I00000oIO(this.zzf, subjectSegmenterOptions.zzf);
                }

                public int hashCode() {
/* 37 */            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf});
                }

                public final lloolOoi zza() {
/* 3 */             Boolean boolValueOf = Boolean.valueOf(this.zza);
/* 9 */             Boolean boolValueOf2 = Boolean.valueOf(this.zzb);
/* 15 */            Boolean boolValueOf3 = Boolean.valueOf(this.zzc);
/* 21 */            Boolean boolValueOf4 = Boolean.valueOf(this.zzd);
/* 27 */            Boolean boolValueOf5 = Boolean.valueOf(this.zze);
/* 33 */            lloolOoi lloolooi = new lloolOoi();
/* 36 */            lloolooi.I00000oIO = boolValueOf;
/* 38 */            lloolooi.I00000oOI = boolValueOf2;
/* 40 */            lloolooi.I0000Il00O = boolValueOf3;
/* 42 */            lloolooi.I0000O = boolValueOf4;
/* 44 */            lloolooi.I0000oI00 = boolValueOf5;
/* 46 */            VarHandle.storeStoreFence();
/* 113 */           return lloolooi;
                }

                public final Executor zzb() {
/* 1 */             return this.zzf;
                }

                public final boolean zzc() {
/* 1 */             return this.zzb;
                }

                public final boolean zzd() {
/* 1 */             return this.zza;
                }

                public final boolean zze() {
/* 1 */             return this.zzc;
                }

                public final boolean zzf() {
/* 1 */             return this.zze;
                }

                public final boolean zzg() {
/* 1 */             return this.zzd;
                }
            }
