            package com.google.ai.edge.litert;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IOOi0Ool1i;
            import p000.IOOi1I;
            import p000.Il011I1OiO0I;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/google/ai/edge/litert/Environment;", "Lcom/google/ai/edge/litert/JniHandle;", "", "handle", "<init>", "(J)V", "LOoiIlOl1iI;", "destroy", "()V", "", "Lcom/google/ai/edge/litert/Accelerator;", "getAvailableAccelerators", "()Ljava/util/Set;", "Companion", "Option", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Environment extends JniHandle {

                public static final Companion INSTANCE = new Companion(null);

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/ai/edge/litert/Environment$Option;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CompilerPluginLibraryDir", "DispatchLibraryDir", "SystemRuntimeHandle", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Option {
                    private static final Il0lIli0 $ENTRIES;
                    private static final Option[] $VALUES;
                    public static final Option CompilerPluginLibraryDir = new Option("CompilerPluginLibraryDir", 0, 0);
                    public static final Option DispatchLibraryDir = new Option("DispatchLibraryDir", 1, 1);
                    public static final Option SystemRuntimeHandle = new Option("SystemRuntimeHandle", 2, 23);
                    private final int value;

                    private static final Option[] $values() {
/* 7 */                 return new Option[]{CompilerPluginLibraryDir, DispatchLibraryDir, SystemRuntimeHandle};
                    }

                    static {
/* 33 */                Option[] optionArr$values = $values();
/* 37 */                $VALUES = optionArr$values;
/* 43 */                $ENTRIES = ilIII1o11.I00000oIO(optionArr$values);
                    }

                    private Option(String str, int i, int i2) {
/* 4 */                 this.value = i2;
                    }

                    public static Il0lIli0 getEntries() {
/* 1 */                 return $ENTRIES;
                    }

                    public static Option valueOf(String str) {
/* 7 */                 return (Option) Enum.valueOf(Option.class, str);
                    }

                    public static Option[] values() {
/* 7 */                 return (Option[]) $VALUES.clone();
                    }

                    public final int getValue() {
/* 1 */                 return this.value;
                    }
                }

                static {
/* 11 */            System.loadLibrary("LiteRt");
                }

                public Environment(long j, DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */             this(j);
                }

                public static final Environment create() {
/* 3 */             return INSTANCE.create();
                }

                private static final native long nativeCreate(int[] iArr, String[] strArr);

                private static final native void nativeDestroy(long j);

                private static final native int[] nativeGetAvailableAccelerators(long j);

                @Override
                public void destroy() {
/* 1 */             INSTANCE.nativeDestroy(getHandle());
                }

                public final Set<Accelerator> getAvailableAccelerators() {
/* 1 */             assertNotDestroyed();
/* 1 */             int[] iArrNativeGetAvailableAccelerators = INSTANCE.nativeGetAvailableAccelerators(getHandle());
/* 17 */            ArrayList arrayList = new ArrayList(iArrNativeGetAvailableAccelerators.length);
/* 22 */            for (int i : iArrNativeGetAvailableAccelerators) {
/* 32 */                arrayList.add(Accelerator.INSTANCE.of$third_party_odml_litert_litert_kotlin_litert_kotlin_api(i));
                    }
/* 38 */            return IOOi0Ool1i.I00iio(arrayList);
                }

                @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0015J&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/ai/edge/litert/Environment$Companion;", "", "<init>", "()V", "", "handle", "", "nativeGetAvailableAccelerators", "(J)[I", "LOoiIlOl1iI;", "nativeDestroy", "(J)V", "", "Lcom/google/ai/edge/litert/Environment$Option;", "", "options", "Lcom/google/ai/edge/litert/Environment;", "create", "(Ljava/util/Map;)Lcom/google/ai/edge/litert/Environment;", "Lcom/google/ai/edge/litert/NpuAcceleratorProvider;", "npuAcceleratorProvider", "(Lcom/google/ai/edge/litert/NpuAcceleratorProvider;Ljava/util/Map;)Lcom/google/ai/edge/litert/Environment;", "keys", "", "values", "nativeCreate", "([ILkotlin/Array;)J", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static Environment create$default(Companion companion, Map map, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     map = Il011I1OiO0I.I00iOIl;
                        }
/* 7 */                 return companion.create((Map<Option, String>) map);
                    }

                    private final long nativeCreate(int[] iArr, String[] strArr) {
/* 1 */                 return Environment.nativeCreate(iArr, strArr);
                    }

                    private final void nativeDestroy(long handle) {
/* 1 */                 Environment.nativeDestroy(handle);
                    }

                    private final int[] nativeGetAvailableAccelerators(long handle) {
/* 1 */                 return Environment.nativeGetAvailableAccelerators(handle);
                    }

                    public final Environment create(NpuAcceleratorProvider npuAcceleratorProvider, Map<Option, String> options) {
/* 3 */                 LinkedHashMap linkedHashMap = new LinkedHashMap(options);
/* 10 */                if (npuAcceleratorProvider.isDeviceSupported() && npuAcceleratorProvider.isLibraryReady()) {
/* 24 */                    linkedHashMap.put(Option.DispatchLibraryDir, npuAcceleratorProvider.getLibraryDir());
/* 33 */                    linkedHashMap.put(Option.CompilerPluginLibraryDir, npuAcceleratorProvider.getLibraryDir());
                        }
/* 36 */                Set setKeySet = linkedHashMap.keySet();
/* 50 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 53 */                Iterator it = setKeySet.iterator();
/* 61 */                while (it.hasNext()) {
/* 77 */                    arrayList.add(Integer.valueOf(((Option) it.next()).getValue()));
                        }
/* 105 */               return new Environment(nativeCreate(IOOi0Ool1i.I00iIO(arrayList), (String[]) linkedHashMap.values().toArray(new String[0])), null);
                    }

/* 4 */             private Companion() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 11 */            public static Environment create$default(Companion companion, NpuAcceleratorProvider npuAcceleratorProvider, Map map, int i, Object obj) {
                        if ((i & 2) != 0) {
/* 12 */                    map = Il011I1OiO0I.I00iOIl;
                        }
/* 13 */                return companion.create(npuAcceleratorProvider, map);
                    }

/* 108 */           public final Environment create(NpuAcceleratorProvider npuAcceleratorProvider) {
/* 109 */               return create$default(this, npuAcceleratorProvider, null, 2, null);
                    }

/* 109 */           public final Environment create(Map<Option, String> options) {
/* 110 */               Set<Option> setKeySet = options.keySet();
/* 111 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 112 */               Iterator<T> it = setKeySet.iterator();
                        while (it.hasNext()) {
/* 115 */                   arrayList.add(Integer.valueOf(((Option) it.next()).getValue()));
                        }
/* 119 */               return new Environment(nativeCreate(IOOi0Ool1i.I00iIO(arrayList), (String[]) options.values().toArray(new String[0])), null);
                    }

/* 119 */           public final Environment create() {
/* 120 */               return create$default(this, null, 1, null);
                    }
                }

/* 4 */         private Environment(long j) {
/* 5 */             super(j);
                }

/* 7 */         public static final Environment create(NpuAcceleratorProvider npuAcceleratorProvider) {
/* 8 */             return INSTANCE.create(npuAcceleratorProvider);
                }

/* 8 */         public static final Environment create(NpuAcceleratorProvider npuAcceleratorProvider, Map<Option, String> map) {
/* 9 */             return INSTANCE.create(npuAcceleratorProvider, map);
                }

/* 9 */         public static final Environment create(Map<Option, String> map) {
/* 10 */            return INSTANCE.create(map);
                }
            }
