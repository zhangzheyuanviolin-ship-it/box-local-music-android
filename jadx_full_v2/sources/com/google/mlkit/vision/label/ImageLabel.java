            package com.google.mlkit.vision.label;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import p000.OlilOlOiI;
            import p000.iOo1oll1;
            import p000.l0IIi01oio;
            import p000.l1ioii1I10Io;
            
/* 19 */    public class ImageLabel {
                private final String zza;
                private final float zzb;
                private final int zzc;
                private final String zzd;

                public ImageLabel(String str, float f, int i) {
/* 4 */             int i2 = l0IIi01oio.I00000oIO;
/* 10 */            this.zza = str == null ? "" : str;
/* 12 */            this.zzb = f;
/* 14 */            this.zzc = i;
/* 18 */            this.zzd = "n/a";
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ImageLabel)) {
/* 7 */                 return false;
                    }
/* 11 */            ImageLabel imageLabel = (ImageLabel) obj;
                    return l1ioii1I10Io.I00000oIO(this.zza, imageLabel.getText()) && Float.compare(this.zzb, imageLabel.getConfidence()) == 0 && this.zzc == imageLabel.getIndex() && l1ioii1I10Io.I00000oIO(this.zzd, imageLabel.zzd);
                }

                public float getConfidence() {
/* 1 */             return this.zzb;
                }

                public int getIndex() {
/* 1 */             return this.zzc;
                }

                public String getText() {
/* 1 */             return this.zza;
                }

                public int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{this.zza, Float.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd});
                }

                public String toString() {
/* 7 */             String simpleName = getClass().getSimpleName();
/* 13 */            OlilOlOiI olilOlOiI = new OlilOlOiI(19);
/* 18 */            int i = 14;
/* 20 */            OlilOlOiI olilOlOiI2 = new OlilOlOiI(i);
/* 23 */            olilOlOiI.I00iiO = olilOlOiI2;
/* 25 */            olilOlOiI.I00iio = olilOlOiI2;
/* 27 */            olilOlOiI.I00iiI = simpleName;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            String str = this.zza;
/* 36 */            OlilOlOiI olilOlOiI3 = new OlilOlOiI(i);
/* 39 */            olilOlOiI2.I00iio = olilOlOiI3;
/* 41 */            olilOlOiI.I00iio = olilOlOiI3;
/* 43 */            olilOlOiI3.I00iiO = str;
/* 47 */            olilOlOiI3.I00iiI = "text";
/* 51 */            String strValueOf = String.valueOf(this.zzb);
/* 57 */            iOo1oll1 ioo1oll1 = new iOo1oll1(i);
/* 64 */            ((OlilOlOiI) olilOlOiI.I00iio).I00iio = ioo1oll1;
/* 66 */            olilOlOiI.I00iio = ioo1oll1;
/* 68 */            ioo1oll1.I00iiO = strValueOf;
/* 72 */            ioo1oll1.I00iiI = "confidence";
/* 76 */            String strValueOf2 = String.valueOf(this.zzc);
/* 82 */            iOo1oll1 ioo1oll12 = new iOo1oll1(i);
/* 89 */            ((OlilOlOiI) olilOlOiI.I00iio).I00iio = ioo1oll12;
/* 91 */            olilOlOiI.I00iio = ioo1oll12;
/* 93 */            ioo1oll12.I00iiO = strValueOf2;
/* 97 */            ioo1oll12.I00iiI = "index";
/* 99 */            String str2 = this.zzd;
/* 103 */           OlilOlOiI olilOlOiI4 = new OlilOlOiI(i);
/* 106 */           ioo1oll12.I00iio = olilOlOiI4;
/* 108 */           olilOlOiI.I00iio = olilOlOiI4;
/* 110 */           olilOlOiI4.I00iiO = str2;
/* 114 */           olilOlOiI4.I00iiI = "mid";
/* 116 */           return olilOlOiI.toString();
                }

/* 20 */        public ImageLabel(String str, float f, int i, String str2) {
/* 22 */            int i2 = l0IIi01oio.I00000oIO;
/* 24 */            this.zza = str == null ? "" : str;
                    this.zzb = f;
                    this.zzc = i;
                    this.zzd = str2;
                }
            }
