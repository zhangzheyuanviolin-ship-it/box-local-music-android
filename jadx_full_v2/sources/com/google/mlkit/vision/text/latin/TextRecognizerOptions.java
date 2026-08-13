            package com.google.mlkit.vision.text.latin;

            import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.text.latin.ModuleDescriptor;
            import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
            import com.google.mlkit.vision.text.internal.TextRecognizerOptionsUtils;
            import java.util.Arrays;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.l1ioii1I10Io;
            
            public class TextRecognizerOptions implements TextRecognizerOptionsInterface {
                public static final TextRecognizerOptions DEFAULT_OPTIONS = new Builder().build();
                private final Executor zzb;
                final AtomicReference zza = new AtomicReference();
                private final String zzc = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

                public static class Builder {
                    private Executor zza;

                    public TextRecognizerOptions build() {
/* 7 */                 return new TextRecognizerOptions(this.zza, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile");
                    }

                    public Builder setExecutor(Executor executor) {
/* 1 */                 this.zza = executor;
/* 49 */                return this;
                    }
                }

                public TextRecognizerOptions(Executor executor, String str) {
/* 11 */            this.zzb = executor;
                }

                public boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof TextRecognizerOptions) {
/* 17 */                return l1ioii1I10Io.I00000oIO(this.zzb, ((TextRecognizerOptions) obj).zzb);
                    }
/* 9 */             return false;
                }

                @Override
                public final String getConfigLabel() {
/* 1 */             return this.zzc;
                }

                @Override
                public final Executor getExecutor() {
/* 1 */             return this.zzb;
                }

                @Override
                public final boolean getIsThickClient() {
/* 5 */             return TextRecognizerOptionsUtils.isThickClient(this.zza, ModuleDescriptor.MODULE_ID);
                }

                @Override
                public final String getLanguageHint() {
/* 1 */             return "en";
                }

                @Override
                public final int getLoggingEventId() {
                    return getIsThickClient() ? 24317 : 24306;
                }

                @Override
                public final int getLoggingLanguageOption() {
/* 1 */             return 1;
                }

                @Override
                public final String getLoggingLibraryName() {
                    return true != getIsThickClient() ? "play-services-mlkit-text-recognition" : "text-recognition";
                }

                @Override
                public final String getLoggingLibraryNameForOptionalModule() {
/* 1 */             return "optional-module-text-latin";
                }

                @Override
                public final String getModuleId() {
                    return true != getIsThickClient() ? "com.google.android.gms.vision.ocr" : ModuleDescriptor.MODULE_ID;
                }

                public int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.zzb});
                }
            }
