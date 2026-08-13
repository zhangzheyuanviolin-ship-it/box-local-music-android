            package com.google.ai.edge.litert;

            import android.os.Build;
            import com.google.ai.edge.litert.NpuCompatibilityChecker;
            import java.util.Set;
            import kotlin.Metadata;
            import p000.I1IoiO1l;
            import p000.OIoi0IIoi;
            import p000.OlOoOIi0o;
            import p000.OlOolloIIOl0;
            
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/google/ai/edge/litert/NpuCompatibilityChecker;", "", "isDeviceSupported", "", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface NpuCompatibilityChecker {

                public static final Companion INSTANCE = Companion.$$INSTANCE;

                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR,\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR,\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/google/ai/edge/litert/NpuCompatibilityChecker$Companion;", "", "<init>", "()V", "", "LOIoi0IIoi;", "", "SUPPORTED_QUALCOMM_SOCS", "Ljava/util/Set;", "getSUPPORTED_QUALCOMM_SOCS$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "()Ljava/util/Set;", "Lcom/google/ai/edge/litert/NpuCompatibilityChecker;", "Qualcomm", "Lcom/google/ai/edge/litert/NpuCompatibilityChecker;", "getQualcomm", "()Lcom/google/ai/edge/litert/NpuCompatibilityChecker;", "SUPPORTED_MEDIATEK_SOCS", "getSUPPORTED_MEDIATEK_SOCS$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "Mediatek", "getMediatek", "SUPPORTED_GOOGLE_SOCS", "getSUPPORTED_GOOGLE_SOCS$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "GoogleTensor", "getGoogleTensor", "Default", "getDefault", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    static final Companion $$INSTANCE = new Companion();
                    private static final Set<OIoi0IIoi> SUPPORTED_QUALCOMM_SOCS = I1IoiO1l.I00IlilI0i0i(new OIoi0IIoi[]{new OIoi0IIoi("QTI", "SM8850"), new OIoi0IIoi("Qualcomm", "SM8850"), new OIoi0IIoi("QTI", "SM8750"), new OIoi0IIoi("Qualcomm", "SM8750"), new OIoi0IIoi("QTI", "SM8650"), new OIoi0IIoi("Qualcomm", "SM8650"), new OIoi0IIoi("QTI", "SM8550"), new OIoi0IIoi("Qualcomm", "SM8550")});
                    private static final NpuCompatibilityChecker Qualcomm = new NpuCompatibilityChecker() {
                        @Override
                        public boolean isDeviceSupported() {
/* 16 */                    return NpuCompatibilityChecker.Companion.$$INSTANCE.m9x2290d62c().contains(new OIoi0IIoi(Build.SOC_MANUFACTURER, Build.SOC_MODEL));
                        }
                    };
                    private static final Set<OIoi0IIoi> SUPPORTED_MEDIATEK_SOCS = I1IoiO1l.I00IlilI0i0i(new OIoi0IIoi[]{new OIoi0IIoi("Mediatek", "MT6877"), new OIoi0IIoi("Mediatek", "MT6878"), new OIoi0IIoi("Mediatek", "MT6879"), new OIoi0IIoi("Mediatek", "MT6893"), new OIoi0IIoi("Mediatek", "MT6897"), new OIoi0IIoi("Mediatek", "MT6983"), new OIoi0IIoi("Mediatek", "MT6985"), new OIoi0IIoi("Mediatek", "MT6989"), new OIoi0IIoi("Mediatek", "MT6991"), new OIoi0IIoi("Mediatek", "MT6993")});
                    private static final NpuCompatibilityChecker Mediatek = new NpuCompatibilityChecker() {
                        @Override
                        public boolean isDeviceSupported() {
/* 22 */                    return NpuCompatibilityChecker.Companion.$$INSTANCE.m8x28dcf31().contains(new OIoi0IIoi(Build.SOC_MANUFACTURER, OlOoOIi0o.I00IioO0OiOi(Build.SOC_MODEL, "(ENG)")));
                        }
                    };
                    private static final Set<OIoi0IIoi> SUPPORTED_GOOGLE_SOCS = I1IoiO1l.I00IlilI0i0i(new OIoi0IIoi[]{new OIoi0IIoi("Google", "Tensor G3"), new OIoi0IIoi("Google", "Tensor G4"), new OIoi0IIoi("Google", "Tensor G5"), new OIoi0IIoi("Google", "Tensor G6")});
                    private static final NpuCompatibilityChecker GoogleTensor = new NpuCompatibilityChecker() {
                        @Override
                        public boolean isDeviceSupported() {
                            return Build.VERSION.SDK_INT >= 36 && NpuCompatibilityChecker.Companion.$$INSTANCE.m7xdad70bce().contains(new OIoi0IIoi(Build.SOC_MANUFACTURER, Build.SOC_MODEL)) && !OlOolloIIOl0.I000l1(Build.ID, "BP2A", false);
                        }
                    };
                    private static final NpuCompatibilityChecker Default = new NpuCompatibilityChecker() {
                        @Override
                        public boolean isDeviceSupported() {
/* 1 */                     NpuCompatibilityChecker.Companion companion = NpuCompatibilityChecker.Companion.$$INSTANCE;
                            return companion.getQualcomm().isDeviceSupported() || companion.getMediatek().isDeviceSupported() || companion.getGoogleTensor().isDeviceSupported();
                        }
                    };

                    private Companion() {
                    }

                    public final NpuCompatibilityChecker getDefault() {
/* 1 */                 return Default;
                    }

                    public final NpuCompatibilityChecker getGoogleTensor() {
/* 1 */                 return GoogleTensor;
                    }

                    public final NpuCompatibilityChecker getMediatek() {
/* 1 */                 return Mediatek;
                    }

                    public final NpuCompatibilityChecker getQualcomm() {
/* 1 */                 return Qualcomm;
                    }

                    public final Set<OIoi0IIoi> m7xdad70bce() {
/* 1 */                 return SUPPORTED_GOOGLE_SOCS;
                    }

                    public final Set<OIoi0IIoi> m8x28dcf31() {
/* 1 */                 return SUPPORTED_MEDIATEK_SOCS;
                    }

                    public final Set<OIoi0IIoi> m9x2290d62c() {
/* 1 */                 return SUPPORTED_QUALCOMM_SOCS;
                    }
                }

                boolean isDeviceSupported();
            }
