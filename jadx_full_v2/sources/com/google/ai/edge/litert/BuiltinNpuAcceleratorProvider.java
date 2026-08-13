            package com.google.ai.edge.litert;

            import android.content.Context;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IOoil1iiIilo;
            import p000.OoiIlOl1iI;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/ai/edge/litert/BuiltinNpuAcceleratorProvider;", "Lcom/google/ai/edge/litert/NpuAcceleratorProvider;", "Landroid/content/Context;", "context", "Lcom/google/ai/edge/litert/NpuCompatibilityChecker;", "npuCompatibilityChecker", "<init>", "(Landroid/content/Context;Lcom/google/ai/edge/litert/NpuCompatibilityChecker;)V", "", "isDeviceSupported", "()Z", "isLibraryReady", "LOoiIlOl1iI;", "downloadLibrary", "(LIOoil1iiIilo;)Ljava/lang/Object;", "", "getLibraryDir", "()Ljava/lang/String;", "Landroid/content/Context;", "Lcom/google/ai/edge/litert/NpuCompatibilityChecker;", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 13 */    public final class BuiltinNpuAcceleratorProvider implements NpuAcceleratorProvider {
                private final Context context;
                private final NpuCompatibilityChecker npuCompatibilityChecker;

                public BuiltinNpuAcceleratorProvider(Context context, NpuCompatibilityChecker npuCompatibilityChecker, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 11 */            this(context, (i & 2) != 0 ? NpuCompatibilityChecker.INSTANCE.getDefault() : npuCompatibilityChecker);
                }

                @Override
                public Object downloadLibrary(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public String getLibraryDir() {
/* 7 */             return this.context.getApplicationInfo().nativeLibraryDir;
                }

                @Override
                public boolean isDeviceSupported() {
/* 3 */             return this.npuCompatibilityChecker.isDeviceSupported();
                }

                @Override
                public boolean isLibraryReady() {
/* 1 */             return true;
                }

/* 14 */        public BuiltinNpuAcceleratorProvider(Context context, NpuCompatibilityChecker npuCompatibilityChecker) {
/* 16 */            this.context = context;
/* 17 */            this.npuCompatibilityChecker = npuCompatibilityChecker;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 17 */        public BuiltinNpuAcceleratorProvider(Context context) {
/* 18 */            this(context, null, 2, 0 == true ? 1 : 0);
                }
            }
