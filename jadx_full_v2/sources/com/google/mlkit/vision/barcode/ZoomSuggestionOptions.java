            package com.google.mlkit.vision.barcode;

            import java.util.Arrays;
            import p000.l1ioii1I10Io;
            
            public class ZoomSuggestionOptions {
                private final ZoomCallback zza;
                private final float zzb;

                public static class Builder {
                    private final ZoomCallback zza;
                    private float zzb;

                    public Builder(ZoomCallback zoomCallback) {
/* 4 */                 this.zza = zoomCallback;
                    }

                    public ZoomSuggestionOptions build() {
/* 8 */                 return new ZoomSuggestionOptions(this.zza, this.zzb, null);
                    }

                    public Builder setMaxSupportedZoomRatio(float f) {
/* 1 */                 this.zzb = f;
/* 49 */                return this;
                    }
                }

                public interface ZoomCallback {
                    boolean setZoom(float f);
                }

                public ZoomSuggestionOptions(ZoomCallback zoomCallback, float f, zzb zzbVar) {
/* 4 */             this.zza = zoomCallback;
/* 6 */             this.zzb = f;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ZoomSuggestionOptions)) {
/* 7 */                 return false;
                    }
/* 11 */            ZoomSuggestionOptions zoomSuggestionOptions = (ZoomSuggestionOptions) obj;
                    return l1ioii1I10Io.I00000oIO(this.zza, zoomSuggestionOptions.zza) && this.zzb == zoomSuggestionOptions.zzb;
                }

                public int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.zza, Float.valueOf(this.zzb)});
                }

                public final float zza() {
/* 1 */             return this.zzb;
                }

                public final ZoomCallback zzb() {
/* 1 */             return this.zza;
                }
            }
