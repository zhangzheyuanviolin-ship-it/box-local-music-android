            package com.google.mlkit.vision.barcode;

            import java.util.Arrays;
            import java.util.concurrent.Executor;
            import p000.l1ioii1I10Io;
            
            public class BarcodeScannerOptions {
                private final int zza;
                private final boolean zzb;
                private final Executor zzc;
                private final ZoomSuggestionOptions zzd;

                public static class Builder {
                    private int zza = 0;
                    private boolean zzb;
                    private Executor zzc;
                    private ZoomSuggestionOptions zzd;

                    public BarcodeScannerOptions build() {
/* 12 */                return new BarcodeScannerOptions(this.zza, this.zzb, this.zzc, this.zzd, null);
                    }

                    public Builder enableAllPotentialBarcodes() {
/* 2 */                 this.zzb = true;
/* 29 */                return this;
                    }

                    public Builder setBarcodeFormats(int i, int... iArr) {
/* 1 */                 this.zza = i;
/* 3 */                 if (iArr != null) {
/* 7 */                     for (int i2 : iArr) {
/* 14 */                        this.zza = i2 | this.zza;
                            }
                        }
/* 89 */                return this;
                    }

                    public Builder setExecutor(Executor executor) {
/* 1 */                 this.zzc = executor;
/* 49 */                return this;
                    }

                    public Builder setZoomSuggestionOptions(ZoomSuggestionOptions zoomSuggestionOptions) {
/* 1 */                 this.zzd = zoomSuggestionOptions;
/* 49 */                return this;
                    }
                }

                public BarcodeScannerOptions(int i, boolean z, Executor executor, ZoomSuggestionOptions zoomSuggestionOptions, zza zzaVar) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = z;
/* 8 */             this.zzc = executor;
/* 10 */            this.zzd = zoomSuggestionOptions;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof BarcodeScannerOptions)) {
/* 7 */                 return false;
                    }
/* 11 */            BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
                    return this.zza == barcodeScannerOptions.zza && this.zzb == barcodeScannerOptions.zzb && l1ioii1I10Io.I00000oIO(this.zzc, barcodeScannerOptions.zzc) && l1ioii1I10Io.I00000oIO(this.zzd, barcodeScannerOptions.zzd);
                }

                public int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Boolean.valueOf(this.zzb), this.zzc, this.zzd});
                }

                public final int zza() {
/* 1 */             return this.zza;
                }

                public final ZoomSuggestionOptions zzb() {
/* 1 */             return this.zzd;
                }

                public final Executor zzc() {
/* 1 */             return this.zzc;
                }

                public final boolean zzd() {
/* 1 */             return this.zzb;
                }
            }
