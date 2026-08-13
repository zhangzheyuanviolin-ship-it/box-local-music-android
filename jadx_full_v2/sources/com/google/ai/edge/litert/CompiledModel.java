            package com.google.ai.edge.litert;

            import android.content.res.AssetManager;
            import com.google.ai.edge.litert.Environment;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I1IoiO1l;
            import p000.IIl001iO0Io;
            import p000.IOOi0Ool1i;
            import p000.IOOi1I;
            import p000.IiO0I1oi0;
            import p000.Il011I1OiO0I;
            import p000.Il0lIli0;
            import p000.O0000Ioio00;
            import p000.O1Oii0O0loo;
            import p000.ilIII1o11;
            
            @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 /2\u00020\u0001:\u00050123/B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001bJ-\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010 J5\u0010\u001e\u001a\u00020\"2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001e\u0010#J1\u0010\u001e\u001a\u00020\"2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010$J?\u0010\u001e\u001a\u00020\"2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0%2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0%2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\"H\u0014¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.¨\u00064"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel;", "Lcom/google/ai/edge/litert/JniHandle;", "", "handle", "Lcom/google/ai/edge/litert/Environment;", "env", "", "envManaged", "<init>", "(JLcom/google/ai/edge/litert/Environment;Z)V", "", "inputName", "signature", "Lcom/google/ai/edge/litert/TensorBuffer;", "createInputBuffer", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/litert/TensorBuffer;", "Lcom/google/ai/edge/litert/TensorBufferRequirements;", "getInputBufferRequirements", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/litert/TensorBufferRequirements;", "outputName", "createOutputBuffer", "getOutputBufferRequirements", "", "signatureIndex", "", "createInputBuffers", "(I)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List;", "createOutputBuffers", "inputs", "run", "(Ljava/util/List;I)Ljava/util/List;", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "outputs", "LOoiIlOl1iI;", "(Ljava/util/List;Ljava/util/List;I)V", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "Lcom/google/ai/edge/litert/TensorType;", "getInputTensorType", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/litert/TensorType;", "getOutputTensorType", "destroy", "()V", "Lcom/google/ai/edge/litert/Environment;", "Z", "Companion", "CpuOptions", "GpuOptions", "QualcommOptions", "Options", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 1 */     public final class CompiledModel extends JniHandle {

                public static final Companion INSTANCE = new Companion(null);
                private final Environment env;
                private final boolean envManaged;

                @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001:\u0005KLMNOB»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u00102\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\f03H\u0000¢\u0006\u0002\b5J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00100JÂ\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010FJ\u0014\u0010G\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010I\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010J\u001a\u00020\fHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100¨\u0006P"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$GpuOptions;", "", "constantTensorSharing", "", "infiniteFloatCapping", "allowSrcQuantizedFcConvOps", "precision", "Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Precision;", "bufferStorageType", "Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$BufferStorageType;", "preferTextureWeights", "serializationDir", "", "modelCacheKey", "serializeProgramCache", "serializeExternalTensors", "externalTensorsMode", "externalTensorPattern", "backend", "Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Backend;", "priority", "Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Priority;", "numStepsOfCommandBufferPreparations", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Precision;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$BufferStorageType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Backend;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Priority;Ljava/lang/Integer;)V", "getConstantTensorSharing", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInfiniteFloatCapping", "getAllowSrcQuantizedFcConvOps", "getPrecision", "()Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Precision;", "getBufferStorageType", "()Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$BufferStorageType;", "getPreferTextureWeights", "getSerializationDir", "()Ljava/lang/String;", "getModelCacheKey", "getSerializeProgramCache", "getSerializeExternalTensors", "getExternalTensorsMode", "getExternalTensorPattern", "getBackend", "()Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Backend;", "getPriority", "()Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Priority;", "getNumStepsOfCommandBufferPreparations", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toMap", "", "Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Key;", "toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Precision;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$BufferStorageType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Backend;Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Priority;Ljava/lang/Integer;)Lcom/google/ai/edge/litert/CompiledModel$GpuOptions;", "equals", "other", "hashCode", "toString", "Precision", "BufferStorageType", "Backend", "Priority", "Key", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class GpuOptions {
                    private final Boolean allowSrcQuantizedFcConvOps;
                    private final Backend backend;
                    private final BufferStorageType bufferStorageType;
                    private final Boolean constantTensorSharing;
                    private final String externalTensorPattern;
                    private final Boolean externalTensorsMode;
                    private final Boolean infiniteFloatCapping;
                    private final String modelCacheKey;
                    private final Integer numStepsOfCommandBufferPreparations;
                    private final Precision precision;
                    private final Boolean preferTextureWeights;
                    private final Priority priority;
                    private final String serializationDir;
                    private final Boolean serializeExternalTensors;
                    private final Boolean serializeProgramCache;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Backend;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AUTOMATIC", "OPENCL", "WEBGPU", "OPENGL", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Backend {
                        private static final Il0lIli0 $ENTRIES;
                        private static final Backend[] $VALUES;
                        private final int value;
                        public static final Backend AUTOMATIC = new Backend("AUTOMATIC", 0, 0);
                        public static final Backend OPENCL = new Backend("OPENCL", 1, 1);

                        @IiO0I1oi0
                        public static final Backend WEBGPU = new Backend("WEBGPU", 2, 2);
                        public static final Backend OPENGL = new Backend("OPENGL", 3, 3);

                        private static final Backend[] $values() {
/* 9 */                     return new Backend[]{AUTOMATIC, OPENCL, WEBGPU, OPENGL};
                        }

                        static {
/* 41 */                    Backend[] backendArr$values = $values();
/* 45 */                    $VALUES = backendArr$values;
/* 51 */                    $ENTRIES = ilIII1o11.I00000oIO(backendArr$values);
                        }

                        private Backend(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static Backend valueOf(String str) {
/* 7 */                     return (Backend) Enum.valueOf(Backend.class, str);
                        }

                        public static Backend[] values() {
/* 7 */                     return (Backend[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$BufferStorageType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "BUFFER", "TEXTURE_2D", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class BufferStorageType {
                        private static final Il0lIli0 $ENTRIES;
                        private static final BufferStorageType[] $VALUES;
                        private final int value;
                        public static final BufferStorageType DEFAULT = new BufferStorageType("DEFAULT", 0, 0);
                        public static final BufferStorageType BUFFER = new BufferStorageType("BUFFER", 1, 1);
                        public static final BufferStorageType TEXTURE_2D = new BufferStorageType("TEXTURE_2D", 2, 2);

                        private static final BufferStorageType[] $values() {
/* 7 */                     return new BufferStorageType[]{DEFAULT, BUFFER, TEXTURE_2D};
                        }

                        static {
/* 31 */                    BufferStorageType[] bufferStorageTypeArr$values = $values();
/* 35 */                    $VALUES = bufferStorageTypeArr$values;
/* 41 */                    $ENTRIES = ilIII1o11.I00000oIO(bufferStorageTypeArr$values);
                        }

                        private BufferStorageType(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static BufferStorageType valueOf(String str) {
/* 7 */                     return (BufferStorageType) Enum.valueOf(BufferStorageType.class, str);
                        }

                        public static BufferStorageType[] values() {
/* 7 */                     return (BufferStorageType[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Key;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONSTANT_TENSOR_SHARING", "INFINITE_FLOAT_CAPPING", "ALLOW_SRC_QUANTIZED_FC_CONV_OPS", "PRECISION", "BUFFER_STORAGE_TYPE", "PREFER_TEXTURE_WEIGHTS", "SERIALIZATION_DIR", "MODEL_CACHE_KEY", "SERIALIZE_PROGRAM_CACHE", "SERIALIZE_EXTERNAL_TENSORS", "EXTERNAL_TENSORS_MODE", "EXTERNAL_TENSOR_PATTERN", "BACKEND", "PRIORITY", "NUM_STEPS_OF_COMMAND_BUFFER_PREPARATIONS", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Key {
                        private static final Il0lIli0 $ENTRIES;
                        private static final Key[] $VALUES;
                        private final int value;
                        public static final Key CONSTANT_TENSOR_SHARING = new Key("CONSTANT_TENSOR_SHARING", 0, 0);
                        public static final Key INFINITE_FLOAT_CAPPING = new Key("INFINITE_FLOAT_CAPPING", 1, 1);
                        public static final Key ALLOW_SRC_QUANTIZED_FC_CONV_OPS = new Key("ALLOW_SRC_QUANTIZED_FC_CONV_OPS", 2, 2);
                        public static final Key PRECISION = new Key("PRECISION", 3, 3);
                        public static final Key BUFFER_STORAGE_TYPE = new Key("BUFFER_STORAGE_TYPE", 4, 4);
                        public static final Key PREFER_TEXTURE_WEIGHTS = new Key("PREFER_TEXTURE_WEIGHTS", 5, 5);
                        public static final Key SERIALIZATION_DIR = new Key("SERIALIZATION_DIR", 6, 6);
                        public static final Key MODEL_CACHE_KEY = new Key("MODEL_CACHE_KEY", 7, 7);
                        public static final Key SERIALIZE_PROGRAM_CACHE = new Key("SERIALIZE_PROGRAM_CACHE", 8, 8);
                        public static final Key SERIALIZE_EXTERNAL_TENSORS = new Key("SERIALIZE_EXTERNAL_TENSORS", 9, 9);
                        public static final Key EXTERNAL_TENSORS_MODE = new Key("EXTERNAL_TENSORS_MODE", 10, 10);
                        public static final Key EXTERNAL_TENSOR_PATTERN = new Key("EXTERNAL_TENSOR_PATTERN", 11, 11);
                        public static final Key BACKEND = new Key("BACKEND", 12, 12);
                        public static final Key PRIORITY = new Key("PRIORITY", 13, 13);
                        public static final Key NUM_STEPS_OF_COMMAND_BUFFER_PREPARATIONS = new Key("NUM_STEPS_OF_COMMAND_BUFFER_PREPARATIONS", 14, 14);

                        private static final Key[] $values() {
/* 31 */                    return new Key[]{CONSTANT_TENSOR_SHARING, INFINITE_FLOAT_CAPPING, ALLOW_SRC_QUANTIZED_FC_CONV_OPS, PRECISION, BUFFER_STORAGE_TYPE, PREFER_TEXTURE_WEIGHTS, SERIALIZATION_DIR, MODEL_CACHE_KEY, SERIALIZE_PROGRAM_CACHE, SERIALIZE_EXTERNAL_TENSORS, EXTERNAL_TENSORS_MODE, EXTERNAL_TENSOR_PATTERN, BACKEND, PRIORITY, NUM_STEPS_OF_COMMAND_BUFFER_PREPARATIONS};
                        }

                        static {
/* 158 */                   Key[] keyArr$values = $values();
/* 162 */                   $VALUES = keyArr$values;
/* 168 */                   $ENTRIES = ilIII1o11.I00000oIO(keyArr$values);
                        }

                        private Key(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static Key valueOf(String str) {
/* 7 */                     return (Key) Enum.valueOf(Key.class, str);
                        }

                        public static Key[] values() {
/* 7 */                     return (Key[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Precision;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "FP16", "FP32", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Precision {
                        private static final Il0lIli0 $ENTRIES;
                        private static final Precision[] $VALUES;
                        public static final Precision DEFAULT = new Precision("DEFAULT", 0, 0);
                        public static final Precision FP16 = new Precision("FP16", 1, 1);
                        public static final Precision FP32 = new Precision("FP32", 2, 2);
                        private final int value;

                        private static final Precision[] $values() {
/* 7 */                     return new Precision[]{DEFAULT, FP16, FP32};
                        }

                        static {
/* 31 */                    Precision[] precisionArr$values = $values();
/* 35 */                    $VALUES = precisionArr$values;
/* 41 */                    $ENTRIES = ilIII1o11.I00000oIO(precisionArr$values);
                        }

                        private Precision(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static Precision valueOf(String str) {
/* 7 */                     return (Precision) Enum.valueOf(Precision.class, str);
                        }

                        public static Precision[] values() {
/* 7 */                     return (Precision[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$GpuOptions$Priority;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "LOW", "NORMAL", "HIGH", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Priority {
                        private static final Il0lIli0 $ENTRIES;
                        private static final Priority[] $VALUES;
                        private final int value;
                        public static final Priority DEFAULT = new Priority("DEFAULT", 0, 0);
                        public static final Priority LOW = new Priority("LOW", 1, 1);
                        public static final Priority NORMAL = new Priority("NORMAL", 2, 2);
                        public static final Priority HIGH = new Priority("HIGH", 3, 3);

                        private static final Priority[] $values() {
/* 9 */                     return new Priority[]{DEFAULT, LOW, NORMAL, HIGH};
                        }

                        static {
/* 41 */                    Priority[] priorityArr$values = $values();
/* 45 */                    $VALUES = priorityArr$values;
/* 51 */                    $ENTRIES = ilIII1o11.I00000oIO(priorityArr$values);
                        }

                        private Priority(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static Priority valueOf(String str) {
/* 7 */                     return (Priority) Enum.valueOf(Priority.class, str);
                        }

                        public static Priority[] values() {
/* 7 */                     return (Priority[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    public GpuOptions(Boolean bool, Boolean bool2, Boolean bool3, Precision precision, BufferStorageType bufferStorageType, Boolean bool4, String str, String str2, Boolean bool5, Boolean bool6, Boolean bool7, String str3, Backend backend, Priority priority, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : precision, (i & 16) != 0 ? null : bufferStorageType, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : str, (i & Barcode.FORMAT_ITF) != 0 ? null : str2, (i & Barcode.FORMAT_QR_CODE) != 0 ? null : bool5, (i & Barcode.FORMAT_UPC_A) != 0 ? null : bool6, (i & Barcode.FORMAT_UPC_E) != 0 ? null : bool7, (i & Barcode.FORMAT_PDF417) != 0 ? null : str3, (i & Barcode.FORMAT_AZTEC) != 0 ? null : backend, (i & 8192) != 0 ? null : priority, (i & 16384) != 0 ? null : num);
                    }

                    public final Boolean getConstantTensorSharing() {
/* 1 */                 return this.constantTensorSharing;
                    }

                    public final Boolean getSerializeExternalTensors() {
/* 1 */                 return this.serializeExternalTensors;
                    }

                    public final Boolean getExternalTensorsMode() {
/* 1 */                 return this.externalTensorsMode;
                    }

                    public final String getExternalTensorPattern() {
/* 1 */                 return this.externalTensorPattern;
                    }

                    public final Backend getBackend() {
/* 1 */                 return this.backend;
                    }

                    public final Priority getPriority() {
/* 1 */                 return this.priority;
                    }

                    public final Integer getNumStepsOfCommandBufferPreparations() {
/* 1 */                 return this.numStepsOfCommandBufferPreparations;
                    }

                    public final Boolean getInfiniteFloatCapping() {
/* 1 */                 return this.infiniteFloatCapping;
                    }

                    public final Boolean getAllowSrcQuantizedFcConvOps() {
/* 1 */                 return this.allowSrcQuantizedFcConvOps;
                    }

                    public final Precision getPrecision() {
/* 1 */                 return this.precision;
                    }

                    public final BufferStorageType getBufferStorageType() {
/* 1 */                 return this.bufferStorageType;
                    }

                    public final Boolean getPreferTextureWeights() {
/* 1 */                 return this.preferTextureWeights;
                    }

                    public final String getSerializationDir() {
/* 1 */                 return this.serializationDir;
                    }

                    public final String getModelCacheKey() {
/* 1 */                 return this.modelCacheKey;
                    }

                    public final Boolean getSerializeProgramCache() {
/* 1 */                 return this.serializeProgramCache;
                    }

                    public final GpuOptions copy(Boolean constantTensorSharing, Boolean infiniteFloatCapping, Boolean allowSrcQuantizedFcConvOps, Precision precision, BufferStorageType bufferStorageType, Boolean preferTextureWeights, String serializationDir, String modelCacheKey, Boolean serializeProgramCache, Boolean serializeExternalTensors, Boolean externalTensorsMode, String externalTensorPattern, Backend backend, Priority priority, Integer numStepsOfCommandBufferPreparations) {
/* 33 */                return new GpuOptions(constantTensorSharing, infiniteFloatCapping, allowSrcQuantizedFcConvOps, precision, bufferStorageType, preferTextureWeights, serializationDir, modelCacheKey, serializeProgramCache, serializeExternalTensors, externalTensorsMode, externalTensorPattern, backend, priority, numStepsOfCommandBufferPreparations);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof GpuOptions)) {
/* 7 */                     return false;
                        }
/* 11 */                GpuOptions gpuOptions = (GpuOptions) other;
                        return O0000Ioio00.I0000O(this.constantTensorSharing, gpuOptions.constantTensorSharing) && O0000Ioio00.I0000O(this.infiniteFloatCapping, gpuOptions.infiniteFloatCapping) && O0000Ioio00.I0000O(this.allowSrcQuantizedFcConvOps, gpuOptions.allowSrcQuantizedFcConvOps) && this.precision == gpuOptions.precision && this.bufferStorageType == gpuOptions.bufferStorageType && O0000Ioio00.I0000O(this.preferTextureWeights, gpuOptions.preferTextureWeights) && O0000Ioio00.I0000O(this.serializationDir, gpuOptions.serializationDir) && O0000Ioio00.I0000O(this.modelCacheKey, gpuOptions.modelCacheKey) && O0000Ioio00.I0000O(this.serializeProgramCache, gpuOptions.serializeProgramCache) && O0000Ioio00.I0000O(this.serializeExternalTensors, gpuOptions.serializeExternalTensors) && O0000Ioio00.I0000O(this.externalTensorsMode, gpuOptions.externalTensorsMode) && O0000Ioio00.I0000O(this.externalTensorPattern, gpuOptions.externalTensorPattern) && this.backend == gpuOptions.backend && this.priority == gpuOptions.priority && O0000Ioio00.I0000O(this.numStepsOfCommandBufferPreparations, gpuOptions.numStepsOfCommandBufferPreparations);
                    }

                    public final Boolean getAllowSrcQuantizedFcConvOps() {
/* 1 */                 return this.allowSrcQuantizedFcConvOps;
                    }

                    public final Backend getBackend() {
/* 1 */                 return this.backend;
                    }

                    public final BufferStorageType getBufferStorageType() {
/* 1 */                 return this.bufferStorageType;
                    }

                    public final Boolean getConstantTensorSharing() {
/* 1 */                 return this.constantTensorSharing;
                    }

                    public final String getExternalTensorPattern() {
/* 1 */                 return this.externalTensorPattern;
                    }

                    public final Boolean getExternalTensorsMode() {
/* 1 */                 return this.externalTensorsMode;
                    }

                    public final Boolean getInfiniteFloatCapping() {
/* 1 */                 return this.infiniteFloatCapping;
                    }

                    public final String getModelCacheKey() {
/* 1 */                 return this.modelCacheKey;
                    }

                    public final Integer getNumStepsOfCommandBufferPreparations() {
/* 1 */                 return this.numStepsOfCommandBufferPreparations;
                    }

                    public final Precision getPrecision() {
/* 1 */                 return this.precision;
                    }

                    public final Boolean getPreferTextureWeights() {
/* 1 */                 return this.preferTextureWeights;
                    }

                    public final Priority getPriority() {
/* 1 */                 return this.priority;
                    }

                    public final String getSerializationDir() {
/* 1 */                 return this.serializationDir;
                    }

                    public final Boolean getSerializeExternalTensors() {
/* 1 */                 return this.serializeExternalTensors;
                    }

                    public final Boolean getSerializeProgramCache() {
/* 1 */                 return this.serializeProgramCache;
                    }

                    public int hashCode() {
/* 1 */                 Boolean bool = this.constantTensorSharing;
/* 12 */                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
/* 14 */                Boolean bool2 = this.infiniteFloatCapping;
/* 25 */                int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 27 */                Boolean bool3 = this.allowSrcQuantizedFcConvOps;
/* 38 */                int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 40 */                Precision precision = this.precision;
/* 51 */                int iHashCode4 = (iHashCode3 + (precision == null ? 0 : precision.hashCode())) * 31;
/* 53 */                BufferStorageType bufferStorageType = this.bufferStorageType;
/* 64 */                int iHashCode5 = (iHashCode4 + (bufferStorageType == null ? 0 : bufferStorageType.hashCode())) * 31;
/* 66 */                Boolean bool4 = this.preferTextureWeights;
/* 77 */                int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
/* 79 */                String str = this.serializationDir;
/* 90 */                int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
/* 92 */                String str2 = this.modelCacheKey;
/* 103 */               int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 105 */               Boolean bool5 = this.serializeProgramCache;
/* 116 */               int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
/* 118 */               Boolean bool6 = this.serializeExternalTensors;
/* 129 */               int iHashCode10 = (iHashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
/* 131 */               Boolean bool7 = this.externalTensorsMode;
/* 142 */               int iHashCode11 = (iHashCode10 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
/* 144 */               String str3 = this.externalTensorPattern;
/* 155 */               int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 157 */               Backend backend = this.backend;
/* 168 */               int iHashCode13 = (iHashCode12 + (backend == null ? 0 : backend.hashCode())) * 31;
/* 170 */               Priority priority = this.priority;
/* 181 */               int iHashCode14 = (iHashCode13 + (priority == null ? 0 : priority.hashCode())) * 31;
/* 183 */               Integer num = this.numStepsOfCommandBufferPreparations;
/* 192 */               return iHashCode14 + (num != null ? num.hashCode() : 0);
                    }

                    public final Map<Key, String> toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api() {
/* 3 */                 LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */                 Boolean bool = this.constantTensorSharing;
/* 8 */                 if (bool != null) {
/* 20 */                    linkedHashMap.put(Key.CONSTANT_TENSOR_SHARING, String.valueOf(bool.booleanValue()));
                        }
/* 23 */                Boolean bool2 = this.infiniteFloatCapping;
/* 25 */                if (bool2 != null) {
/* 37 */                    linkedHashMap.put(Key.INFINITE_FLOAT_CAPPING, String.valueOf(bool2.booleanValue()));
                        }
/* 40 */                Boolean bool3 = this.allowSrcQuantizedFcConvOps;
/* 42 */                if (bool3 != null) {
/* 54 */                    linkedHashMap.put(Key.ALLOW_SRC_QUANTIZED_FC_CONV_OPS, String.valueOf(bool3.booleanValue()));
                        }
/* 57 */                Precision precision = this.precision;
/* 59 */                if (precision != null) {
/* 71 */                    linkedHashMap.put(Key.PRECISION, String.valueOf(precision.getValue()));
                        }
/* 74 */                BufferStorageType bufferStorageType = this.bufferStorageType;
/* 76 */                if (bufferStorageType != null) {
/* 88 */                    linkedHashMap.put(Key.BUFFER_STORAGE_TYPE, String.valueOf(bufferStorageType.getValue()));
                        }
/* 91 */                Boolean bool4 = this.preferTextureWeights;
/* 93 */                if (bool4 != null) {
/* 105 */                   linkedHashMap.put(Key.PREFER_TEXTURE_WEIGHTS, String.valueOf(bool4.booleanValue()));
                        }
/* 108 */               String str = this.serializationDir;
/* 110 */               if (str != null) {
/* 114 */                   linkedHashMap.put(Key.SERIALIZATION_DIR, str);
                        }
/* 117 */               String str2 = this.modelCacheKey;
/* 119 */               if (str2 != null) {
/* 123 */                   linkedHashMap.put(Key.MODEL_CACHE_KEY, str2);
                        }
/* 126 */               Boolean bool5 = this.serializeProgramCache;
/* 128 */               if (bool5 != null) {
/* 140 */                   linkedHashMap.put(Key.SERIALIZE_PROGRAM_CACHE, String.valueOf(bool5.booleanValue()));
                        }
/* 143 */               Boolean bool6 = this.serializeExternalTensors;
/* 145 */               if (bool6 != null) {
/* 157 */                   linkedHashMap.put(Key.SERIALIZE_EXTERNAL_TENSORS, String.valueOf(bool6.booleanValue()));
                        }
/* 160 */               Boolean bool7 = this.externalTensorsMode;
/* 162 */               if (bool7 != null) {
/* 174 */                   linkedHashMap.put(Key.EXTERNAL_TENSORS_MODE, String.valueOf(bool7.booleanValue()));
                        }
/* 177 */               String str3 = this.externalTensorPattern;
/* 179 */               if (str3 != null) {
/* 183 */                   linkedHashMap.put(Key.EXTERNAL_TENSOR_PATTERN, str3);
                        }
/* 186 */               Backend backend = this.backend;
/* 188 */               if (backend != null) {
/* 200 */                   linkedHashMap.put(Key.BACKEND, String.valueOf(backend.getValue()));
                        }
/* 203 */               Priority priority = this.priority;
/* 205 */               if (priority != null) {
/* 217 */                   linkedHashMap.put(Key.PRIORITY, String.valueOf(priority.getValue()));
                        }
/* 220 */               Integer num = this.numStepsOfCommandBufferPreparations;
/* 222 */               if (num != null) {
/* 234 */                   linkedHashMap.put(Key.NUM_STEPS_OF_COMMAND_BUFFER_PREPARATIONS, String.valueOf(num.intValue()));
                        }
/* 237 */               return O1Oii0O0loo.I000iOII(linkedHashMap);
                    }

                    public String toString() {
/* 3 */                 Boolean bool = this.constantTensorSharing;
/* 5 */                 Boolean bool2 = this.infiniteFloatCapping;
/* 7 */                 Boolean bool3 = this.allowSrcQuantizedFcConvOps;
/* 9 */                 Precision precision = this.precision;
/* 11 */                BufferStorageType bufferStorageType = this.bufferStorageType;
/* 13 */                Boolean bool4 = this.preferTextureWeights;
/* 15 */                String str = this.serializationDir;
/* 17 */                String str2 = this.modelCacheKey;
/* 19 */                Boolean bool5 = this.serializeProgramCache;
/* 21 */                Boolean bool6 = this.serializeExternalTensors;
/* 23 */                Boolean bool7 = this.externalTensorsMode;
/* 25 */                String str3 = this.externalTensorPattern;
/* 27 */                Backend backend = this.backend;
/* 29 */                Priority priority = this.priority;
/* 31 */                Integer num = this.numStepsOfCommandBufferPreparations;
/* 39 */                StringBuilder sb = new StringBuilder("GpuOptions(constantTensorSharing=");
/* 42 */                sb.append(bool);
/* 47 */                sb.append(", infiniteFloatCapping=");
/* 50 */                sb.append(bool2);
/* 55 */                sb.append(", allowSrcQuantizedFcConvOps=");
/* 58 */                sb.append(bool3);
/* 63 */                sb.append(", precision=");
/* 66 */                sb.append(precision);
/* 71 */                sb.append(", bufferStorageType=");
/* 74 */                sb.append(bufferStorageType);
/* 79 */                sb.append(", preferTextureWeights=");
/* 82 */                sb.append(bool4);
/* 87 */                sb.append(", serializationDir=");
/* 94 */                IIl001iO0Io.I001lIiIIo1O(sb, str, ", modelCacheKey=", str2, ", serializeProgramCache=");
/* 97 */                sb.append(bool5);
/* 102 */               sb.append(", serializeExternalTensors=");
/* 105 */               sb.append(bool6);
/* 110 */               sb.append(", externalTensorsMode=");
/* 113 */               sb.append(bool7);
/* 118 */               sb.append(", externalTensorPattern=");
/* 121 */               sb.append(str3);
/* 126 */               sb.append(", backend=");
/* 129 */               sb.append(backend);
/* 134 */               sb.append(", priority=");
/* 137 */               sb.append(priority);
/* 142 */               sb.append(", numStepsOfCommandBufferPreparations=");
/* 147 */               sb.append(num);
/* 152 */               sb.append(")");
/* 155 */               return sb.toString();
                    }

/* 1 */             public GpuOptions(Boolean bool, Boolean bool2, Boolean bool3, Precision precision, BufferStorageType bufferStorageType, Boolean bool4, String str, String str2, Boolean bool5, Boolean bool6, Boolean bool7, String str3, Backend backend, Priority priority, Integer num) {
/* 3 */                 this.constantTensorSharing = bool;
/* 4 */                 this.infiniteFloatCapping = bool2;
/* 5 */                 this.allowSrcQuantizedFcConvOps = bool3;
/* 6 */                 this.precision = precision;
/* 7 */                 this.bufferStorageType = bufferStorageType;
/* 8 */                 this.preferTextureWeights = bool4;
/* 9 */                 this.serializationDir = str;
/* 10 */                this.modelCacheKey = str2;
/* 11 */                this.serializeProgramCache = bool5;
/* 12 */                this.serializeExternalTensors = bool6;
/* 13 */                this.externalTensorsMode = bool7;
/* 14 */                this.externalTensorPattern = str3;
/* 15 */                this.backend = backend;
/* 16 */                this.priority = priority;
/* 17 */                this.numStepsOfCommandBufferPreparations = num;
                    }

/* 17 */            public GpuOptions() {
/* 18 */                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
                    }
                }

                @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001:\u0005MNOPQBµ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001206H\u0000¢\u0006\u0002\b8J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003J¼\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010HJ\u0014\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010K\u001a\u00020\nHÖ\u0081\u0004J\n\u0010L\u001a\u00020\u0012HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006R"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions;", "", "logLevel", "Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$LogLevel;", "useHtpPreference", "", "useQint16AsQuint16", "enableWeightSharing", "dumpTensorIds", "", "", "useConvHmx", "useFoldRelu", "htpPerformanceMode", "Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$HtpPerformanceMode;", "profiling", "Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$Profiling;", "irJsonDir", "", "dlcDir", "vtcmSize", "numHvxThreads", "optimizationLevel", "Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$OptimizationLevel;", "<init>", "(Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$LogLevel;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$HtpPerformanceMode;Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$Profiling;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$OptimizationLevel;)V", "getLogLevel", "()Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$LogLevel;", "getUseHtpPreference$annotations", "()V", "getUseHtpPreference", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUseQint16AsQuint16$annotations", "getUseQint16AsQuint16", "getEnableWeightSharing", "getDumpTensorIds", "()Ljava/util/List;", "getUseConvHmx", "getUseFoldRelu", "getHtpPerformanceMode", "()Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$HtpPerformanceMode;", "getProfiling", "()Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$Profiling;", "getIrJsonDir", "()Ljava/lang/String;", "getDlcDir", "getVtcmSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumHvxThreads", "getOptimizationLevel", "()Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$OptimizationLevel;", "toMap", "", "Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$Key;", "toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$LogLevel;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$HtpPerformanceMode;Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$Profiling;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$OptimizationLevel;)Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions;", "equals", "other", "hashCode", "toString", "LogLevel", "HtpPerformanceMode", "Profiling", "OptimizationLevel", "Key", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class QualcommOptions {
                    private final String dlcDir;
                    private final List<Integer> dumpTensorIds;
                    private final Boolean enableWeightSharing;
                    private final HtpPerformanceMode htpPerformanceMode;
                    private final String irJsonDir;
                    private final LogLevel logLevel;
                    private final Integer numHvxThreads;
                    private final OptimizationLevel optimizationLevel;
                    private final Profiling profiling;
                    private final Boolean useConvHmx;
                    private final Boolean useFoldRelu;
                    private final Boolean useHtpPreference;
                    private final Boolean useQint16AsQuint16;
                    private final Integer vtcmSize;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$HtpPerformanceMode;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "SUSTAINED_HIGH_PERFORMANCE", "BURST", "HIGH_PERFORMANCE", "POWER_SAVER", "LOW_POWER_SAVER", "HIGH_POWER_SAVER", "LOW_BALANCED", "BALANCED", "EXTREME_POWER_SAVER", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class HtpPerformanceMode {
                        private static final Il0lIli0 $ENTRIES;
                        private static final HtpPerformanceMode[] $VALUES;
                        private final int value;
                        public static final HtpPerformanceMode DEFAULT = new HtpPerformanceMode("DEFAULT", 0, 0);
                        public static final HtpPerformanceMode SUSTAINED_HIGH_PERFORMANCE = new HtpPerformanceMode("SUSTAINED_HIGH_PERFORMANCE", 1, 1);
                        public static final HtpPerformanceMode BURST = new HtpPerformanceMode("BURST", 2, 2);
                        public static final HtpPerformanceMode HIGH_PERFORMANCE = new HtpPerformanceMode("HIGH_PERFORMANCE", 3, 3);
                        public static final HtpPerformanceMode POWER_SAVER = new HtpPerformanceMode("POWER_SAVER", 4, 4);
                        public static final HtpPerformanceMode LOW_POWER_SAVER = new HtpPerformanceMode("LOW_POWER_SAVER", 5, 5);
                        public static final HtpPerformanceMode HIGH_POWER_SAVER = new HtpPerformanceMode("HIGH_POWER_SAVER", 6, 6);
                        public static final HtpPerformanceMode LOW_BALANCED = new HtpPerformanceMode("LOW_BALANCED", 7, 7);
                        public static final HtpPerformanceMode BALANCED = new HtpPerformanceMode("BALANCED", 8, 8);
                        public static final HtpPerformanceMode EXTREME_POWER_SAVER = new HtpPerformanceMode("EXTREME_POWER_SAVER", 9, 9);

                        private static final HtpPerformanceMode[] $values() {
/* 21 */                    return new HtpPerformanceMode[]{DEFAULT, SUSTAINED_HIGH_PERFORMANCE, BURST, HIGH_PERFORMANCE, POWER_SAVER, LOW_POWER_SAVER, HIGH_POWER_SAVER, LOW_BALANCED, BALANCED, EXTREME_POWER_SAVER};
                        }

                        static {
/* 103 */                   HtpPerformanceMode[] htpPerformanceModeArr$values = $values();
/* 107 */                   $VALUES = htpPerformanceModeArr$values;
/* 113 */                   $ENTRIES = ilIII1o11.I00000oIO(htpPerformanceModeArr$values);
                        }

                        private HtpPerformanceMode(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static HtpPerformanceMode valueOf(String str) {
/* 7 */                     return (HtpPerformanceMode) Enum.valueOf(HtpPerformanceMode.class, str);
                        }

                        public static HtpPerformanceMode[] values() {
/* 7 */                     return (HtpPerformanceMode[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$Key;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOG_LEVEL", "USE_HTP_PREFERENCE", "USE_QINT16_AS_QUINT16", "ENABLE_WEIGHT_SHARING", "DUMP_TENSOR_IDS", "USE_CONV_HMX", "USE_FOLD_RELU", "HTP_PERFORMANCE_MODE", "PROFILING", "IR_JSON_DIR", "DLC_DIR", "VTCM_SIZE", "NUM_HVX_THREADS", "OPTIMIZATION_LEVEL", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Key {
                        private static final Il0lIli0 $ENTRIES;
                        private static final Key[] $VALUES;
                        private final int value;
                        public static final Key LOG_LEVEL = new Key("LOG_LEVEL", 0, 0);
                        public static final Key USE_HTP_PREFERENCE = new Key("USE_HTP_PREFERENCE", 1, 1);
                        public static final Key USE_QINT16_AS_QUINT16 = new Key("USE_QINT16_AS_QUINT16", 2, 2);
                        public static final Key ENABLE_WEIGHT_SHARING = new Key("ENABLE_WEIGHT_SHARING", 3, 3);
                        public static final Key DUMP_TENSOR_IDS = new Key("DUMP_TENSOR_IDS", 4, 4);
                        public static final Key USE_CONV_HMX = new Key("USE_CONV_HMX", 5, 5);
                        public static final Key USE_FOLD_RELU = new Key("USE_FOLD_RELU", 6, 6);
                        public static final Key HTP_PERFORMANCE_MODE = new Key("HTP_PERFORMANCE_MODE", 7, 7);
                        public static final Key PROFILING = new Key("PROFILING", 8, 8);
                        public static final Key IR_JSON_DIR = new Key("IR_JSON_DIR", 9, 9);
                        public static final Key DLC_DIR = new Key("DLC_DIR", 10, 10);
                        public static final Key VTCM_SIZE = new Key("VTCM_SIZE", 11, 11);
                        public static final Key NUM_HVX_THREADS = new Key("NUM_HVX_THREADS", 12, 12);
                        public static final Key OPTIMIZATION_LEVEL = new Key("OPTIMIZATION_LEVEL", 13, 13);

                        private static final Key[] $values() {
/* 29 */                    return new Key[]{LOG_LEVEL, USE_HTP_PREFERENCE, USE_QINT16_AS_QUINT16, ENABLE_WEIGHT_SHARING, DUMP_TENSOR_IDS, USE_CONV_HMX, USE_FOLD_RELU, HTP_PERFORMANCE_MODE, PROFILING, IR_JSON_DIR, DLC_DIR, VTCM_SIZE, NUM_HVX_THREADS, OPTIMIZATION_LEVEL};
                        }

                        static {
/* 147 */                   Key[] keyArr$values = $values();
/* 151 */                   $VALUES = keyArr$values;
/* 157 */                   $ENTRIES = ilIII1o11.I00000oIO(keyArr$values);
                        }

                        private Key(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static Key valueOf(String str) {
/* 7 */                     return (Key) Enum.valueOf(Key.class, str);
                        }

                        public static Key[] values() {
/* 7 */                     return (Key[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$LogLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OFF", "ERROR", "WARN", "INFO", "VERBOSE", "DEBUG", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class LogLevel {
                        private static final Il0lIli0 $ENTRIES;
                        private static final LogLevel[] $VALUES;
                        private final int value;
                        public static final LogLevel OFF = new LogLevel("OFF", 0, 0);
                        public static final LogLevel ERROR = new LogLevel("ERROR", 1, 1);
                        public static final LogLevel WARN = new LogLevel("WARN", 2, 2);
                        public static final LogLevel INFO = new LogLevel("INFO", 3, 3);
                        public static final LogLevel VERBOSE = new LogLevel("VERBOSE", 4, 4);
                        public static final LogLevel DEBUG = new LogLevel("DEBUG", 5, 5);

                        private static final LogLevel[] $values() {
/* 13 */                    return new LogLevel[]{OFF, ERROR, WARN, INFO, VERBOSE, DEBUG};
                        }

                        static {
/* 61 */                    LogLevel[] logLevelArr$values = $values();
/* 65 */                    $VALUES = logLevelArr$values;
/* 71 */                    $ENTRIES = ilIII1o11.I00000oIO(logLevelArr$values);
                        }

                        private LogLevel(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static LogLevel valueOf(String str) {
/* 7 */                     return (LogLevel) Enum.valueOf(LogLevel.class, str);
                        }

                        public static LogLevel[] values() {
/* 7 */                     return (LogLevel[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$OptimizationLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HTP_OPTIMIZE_FOR_INFERENCE", "HTP_OPTIMIZE_FOR_PREPARE", "HTP_OPTIMIZE_FOR_INFERENCE_O3", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class OptimizationLevel {
                        private static final Il0lIli0 $ENTRIES;
                        private static final OptimizationLevel[] $VALUES;
                        private final int value;
                        public static final OptimizationLevel HTP_OPTIMIZE_FOR_INFERENCE = new OptimizationLevel("HTP_OPTIMIZE_FOR_INFERENCE", 0, 0);
                        public static final OptimizationLevel HTP_OPTIMIZE_FOR_PREPARE = new OptimizationLevel("HTP_OPTIMIZE_FOR_PREPARE", 1, 1);
                        public static final OptimizationLevel HTP_OPTIMIZE_FOR_INFERENCE_O3 = new OptimizationLevel("HTP_OPTIMIZE_FOR_INFERENCE_O3", 2, 2);

                        private static final OptimizationLevel[] $values() {
/* 7 */                     return new OptimizationLevel[]{HTP_OPTIMIZE_FOR_INFERENCE, HTP_OPTIMIZE_FOR_PREPARE, HTP_OPTIMIZE_FOR_INFERENCE_O3};
                        }

                        static {
/* 31 */                    OptimizationLevel[] optimizationLevelArr$values = $values();
/* 35 */                    $VALUES = optimizationLevelArr$values;
/* 41 */                    $ENTRIES = ilIII1o11.I00000oIO(optimizationLevelArr$values);
                        }

                        private OptimizationLevel(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static OptimizationLevel valueOf(String str) {
/* 7 */                     return (OptimizationLevel) Enum.valueOf(OptimizationLevel.class, str);
                        }

                        public static OptimizationLevel[] values() {
/* 7 */                     return (OptimizationLevel[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions$Profiling;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OFF", "BASIC", "DETAILED", "LINTING", "OPTRACE", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Profiling {
                        private static final Il0lIli0 $ENTRIES;
                        private static final Profiling[] $VALUES;
                        private final int value;
                        public static final Profiling OFF = new Profiling("OFF", 0, 0);
                        public static final Profiling BASIC = new Profiling("BASIC", 1, 1);
                        public static final Profiling DETAILED = new Profiling("DETAILED", 2, 2);
                        public static final Profiling LINTING = new Profiling("LINTING", 3, 3);
                        public static final Profiling OPTRACE = new Profiling("OPTRACE", 4, 4);

                        private static final Profiling[] $values() {
/* 11 */                    return new Profiling[]{OFF, BASIC, DETAILED, LINTING, OPTRACE};
                        }

                        static {
/* 51 */                    Profiling[] profilingArr$values = $values();
/* 55 */                    $VALUES = profilingArr$values;
/* 61 */                    $ENTRIES = ilIII1o11.I00000oIO(profilingArr$values);
                        }

                        private Profiling(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static Profiling valueOf(String str) {
/* 7 */                     return (Profiling) Enum.valueOf(Profiling.class, str);
                        }

                        public static Profiling[] values() {
/* 7 */                     return (Profiling[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    public QualcommOptions(LogLevel logLevel, Boolean bool, Boolean bool2, Boolean bool3, List list, Boolean bool4, Boolean bool5, HtpPerformanceMode htpPerformanceMode, Profiling profiling, String str, String str2, Integer num, Integer num2, OptimizationLevel optimizationLevel, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this((i & 1) != 0 ? null : logLevel, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : bool5, (i & Barcode.FORMAT_ITF) != 0 ? null : htpPerformanceMode, (i & Barcode.FORMAT_QR_CODE) != 0 ? null : profiling, (i & Barcode.FORMAT_UPC_A) != 0 ? null : str, (i & Barcode.FORMAT_UPC_E) != 0 ? null : str2, (i & Barcode.FORMAT_PDF417) != 0 ? null : num, (i & Barcode.FORMAT_AZTEC) != 0 ? null : num2, (i & 8192) != 0 ? null : optimizationLevel);
                    }

                    public final LogLevel getLogLevel() {
/* 1 */                 return this.logLevel;
                    }

                    public final String getIrJsonDir() {
/* 1 */                 return this.irJsonDir;
                    }

                    public final String getDlcDir() {
/* 1 */                 return this.dlcDir;
                    }

                    public final Integer getVtcmSize() {
/* 1 */                 return this.vtcmSize;
                    }

                    public final Integer getNumHvxThreads() {
/* 1 */                 return this.numHvxThreads;
                    }

                    public final OptimizationLevel getOptimizationLevel() {
/* 1 */                 return this.optimizationLevel;
                    }

                    public final Boolean getUseHtpPreference() {
/* 1 */                 return this.useHtpPreference;
                    }

                    public final Boolean getUseQint16AsQuint16() {
/* 1 */                 return this.useQint16AsQuint16;
                    }

                    public final Boolean getEnableWeightSharing() {
/* 1 */                 return this.enableWeightSharing;
                    }

                    public final List<Integer> component5() {
/* 1 */                 return this.dumpTensorIds;
                    }

                    public final Boolean getUseConvHmx() {
/* 1 */                 return this.useConvHmx;
                    }

                    public final Boolean getUseFoldRelu() {
/* 1 */                 return this.useFoldRelu;
                    }

                    public final HtpPerformanceMode getHtpPerformanceMode() {
/* 1 */                 return this.htpPerformanceMode;
                    }

                    public final Profiling getProfiling() {
/* 1 */                 return this.profiling;
                    }

                    public final QualcommOptions copy(LogLevel logLevel, Boolean useHtpPreference, Boolean useQint16AsQuint16, Boolean enableWeightSharing, List<Integer> dumpTensorIds, Boolean useConvHmx, Boolean useFoldRelu, HtpPerformanceMode htpPerformanceMode, Profiling profiling, String irJsonDir, String dlcDir, Integer vtcmSize, Integer numHvxThreads, OptimizationLevel optimizationLevel) {
/* 3 */                 return new QualcommOptions(logLevel, useHtpPreference, useQint16AsQuint16, enableWeightSharing, dumpTensorIds, useConvHmx, useFoldRelu, htpPerformanceMode, profiling, irJsonDir, dlcDir, vtcmSize, numHvxThreads, optimizationLevel);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof QualcommOptions)) {
/* 7 */                     return false;
                        }
/* 11 */                QualcommOptions qualcommOptions = (QualcommOptions) other;
                        return this.logLevel == qualcommOptions.logLevel && O0000Ioio00.I0000O(this.useHtpPreference, qualcommOptions.useHtpPreference) && O0000Ioio00.I0000O(this.useQint16AsQuint16, qualcommOptions.useQint16AsQuint16) && O0000Ioio00.I0000O(this.enableWeightSharing, qualcommOptions.enableWeightSharing) && O0000Ioio00.I0000O(this.dumpTensorIds, qualcommOptions.dumpTensorIds) && O0000Ioio00.I0000O(this.useConvHmx, qualcommOptions.useConvHmx) && O0000Ioio00.I0000O(this.useFoldRelu, qualcommOptions.useFoldRelu) && this.htpPerformanceMode == qualcommOptions.htpPerformanceMode && this.profiling == qualcommOptions.profiling && O0000Ioio00.I0000O(this.irJsonDir, qualcommOptions.irJsonDir) && O0000Ioio00.I0000O(this.dlcDir, qualcommOptions.dlcDir) && O0000Ioio00.I0000O(this.vtcmSize, qualcommOptions.vtcmSize) && O0000Ioio00.I0000O(this.numHvxThreads, qualcommOptions.numHvxThreads) && this.optimizationLevel == qualcommOptions.optimizationLevel;
                    }

                    public final String getDlcDir() {
/* 1 */                 return this.dlcDir;
                    }

                    public final List<Integer> getDumpTensorIds() {
/* 1 */                 return this.dumpTensorIds;
                    }

                    public final Boolean getEnableWeightSharing() {
/* 1 */                 return this.enableWeightSharing;
                    }

                    public final HtpPerformanceMode getHtpPerformanceMode() {
/* 1 */                 return this.htpPerformanceMode;
                    }

                    public final String getIrJsonDir() {
/* 1 */                 return this.irJsonDir;
                    }

                    public final LogLevel getLogLevel() {
/* 1 */                 return this.logLevel;
                    }

                    public final Integer getNumHvxThreads() {
/* 1 */                 return this.numHvxThreads;
                    }

                    public final OptimizationLevel getOptimizationLevel() {
/* 1 */                 return this.optimizationLevel;
                    }

                    public final Profiling getProfiling() {
/* 1 */                 return this.profiling;
                    }

                    public final Boolean getUseConvHmx() {
/* 1 */                 return this.useConvHmx;
                    }

                    public final Boolean getUseFoldRelu() {
/* 1 */                 return this.useFoldRelu;
                    }

                    public final Boolean getUseHtpPreference() {
/* 1 */                 return this.useHtpPreference;
                    }

                    public final Boolean getUseQint16AsQuint16() {
/* 1 */                 return this.useQint16AsQuint16;
                    }

                    public final Integer getVtcmSize() {
/* 1 */                 return this.vtcmSize;
                    }

                    public int hashCode() {
/* 1 */                 LogLevel logLevel = this.logLevel;
/* 12 */                int iHashCode = (logLevel == null ? 0 : logLevel.hashCode()) * 31;
/* 14 */                Boolean bool = this.useHtpPreference;
/* 25 */                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 27 */                Boolean bool2 = this.useQint16AsQuint16;
/* 38 */                int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 40 */                Boolean bool3 = this.enableWeightSharing;
/* 51 */                int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 53 */                List<Integer> list = this.dumpTensorIds;
/* 64 */                int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
/* 66 */                Boolean bool4 = this.useConvHmx;
/* 77 */                int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
/* 79 */                Boolean bool5 = this.useFoldRelu;
/* 90 */                int iHashCode7 = (iHashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
/* 92 */                HtpPerformanceMode htpPerformanceMode = this.htpPerformanceMode;
/* 103 */               int iHashCode8 = (iHashCode7 + (htpPerformanceMode == null ? 0 : htpPerformanceMode.hashCode())) * 31;
/* 105 */               Profiling profiling = this.profiling;
/* 116 */               int iHashCode9 = (iHashCode8 + (profiling == null ? 0 : profiling.hashCode())) * 31;
/* 118 */               String str = this.irJsonDir;
/* 129 */               int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
/* 131 */               String str2 = this.dlcDir;
/* 142 */               int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 144 */               Integer num = this.vtcmSize;
/* 155 */               int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
/* 157 */               Integer num2 = this.numHvxThreads;
/* 168 */               int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 170 */               OptimizationLevel optimizationLevel = this.optimizationLevel;
/* 179 */               return iHashCode13 + (optimizationLevel != null ? optimizationLevel.hashCode() : 0);
                    }

                    public final Map<Key, String> toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api() {
/* 3 */                 LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */                 LogLevel logLevel = this.logLevel;
/* 8 */                 if (logLevel != null) {
/* 20 */                    linkedHashMap.put(Key.LOG_LEVEL, String.valueOf(logLevel.getValue()));
                        }
/* 23 */                Boolean bool = this.enableWeightSharing;
/* 25 */                if (bool != null) {
/* 37 */                    linkedHashMap.put(Key.ENABLE_WEIGHT_SHARING, String.valueOf(bool.booleanValue()));
                        }
/* 40 */                List<Integer> list = this.dumpTensorIds;
/* 42 */                if (list != null) {
/* 60 */                    linkedHashMap.put(Key.DUMP_TENSOR_IDS, IOOi0Ool1i.I00IlilI0i0i(list, ",", null, null, null, 62));
                        }
/* 63 */                Boolean bool2 = this.useConvHmx;
/* 65 */                if (bool2 != null) {
/* 77 */                    linkedHashMap.put(Key.USE_CONV_HMX, String.valueOf(bool2.booleanValue()));
                        }
/* 80 */                Boolean bool3 = this.useFoldRelu;
/* 82 */                if (bool3 != null) {
/* 94 */                    linkedHashMap.put(Key.USE_FOLD_RELU, String.valueOf(bool3.booleanValue()));
                        }
/* 97 */                HtpPerformanceMode htpPerformanceMode = this.htpPerformanceMode;
/* 99 */                if (htpPerformanceMode != null) {
/* 111 */                   linkedHashMap.put(Key.HTP_PERFORMANCE_MODE, String.valueOf(htpPerformanceMode.getValue()));
                        }
/* 114 */               Profiling profiling = this.profiling;
/* 116 */               if (profiling != null) {
/* 128 */                   linkedHashMap.put(Key.PROFILING, String.valueOf(profiling.getValue()));
                        }
/* 131 */               String str = this.irJsonDir;
/* 133 */               if (str != null) {
/* 137 */                   linkedHashMap.put(Key.IR_JSON_DIR, str);
                        }
/* 140 */               String str2 = this.dlcDir;
/* 142 */               if (str2 != null) {
/* 146 */                   linkedHashMap.put(Key.DLC_DIR, str2);
                        }
/* 149 */               Integer num = this.vtcmSize;
/* 151 */               if (num != null) {
/* 163 */                   linkedHashMap.put(Key.VTCM_SIZE, String.valueOf(num.intValue()));
                        }
/* 166 */               Integer num2 = this.numHvxThreads;
/* 168 */               if (num2 != null) {
/* 180 */                   linkedHashMap.put(Key.NUM_HVX_THREADS, String.valueOf(num2.intValue()));
                        }
/* 183 */               OptimizationLevel optimizationLevel = this.optimizationLevel;
/* 185 */               if (optimizationLevel != null) {
/* 197 */                   linkedHashMap.put(Key.OPTIMIZATION_LEVEL, String.valueOf(optimizationLevel.getValue()));
                        }
/* 200 */               return O1Oii0O0loo.I000iOII(linkedHashMap);
                    }

                    public String toString() {
/* 148 */               return "QualcommOptions(logLevel=" + this.logLevel + ", useHtpPreference=" + this.useHtpPreference + ", useQint16AsQuint16=" + this.useQint16AsQuint16 + ", enableWeightSharing=" + this.enableWeightSharing + ", dumpTensorIds=" + this.dumpTensorIds + ", useConvHmx=" + this.useConvHmx + ", useFoldRelu=" + this.useFoldRelu + ", htpPerformanceMode=" + this.htpPerformanceMode + ", profiling=" + this.profiling + ", irJsonDir=" + this.irJsonDir + ", dlcDir=" + this.dlcDir + ", vtcmSize=" + this.vtcmSize + ", numHvxThreads=" + this.numHvxThreads + ", optimizationLevel=" + this.optimizationLevel + ")";
                    }

/* 1 */             public QualcommOptions(LogLevel logLevel, Boolean bool, Boolean bool2, Boolean bool3, List<Integer> list, Boolean bool4, Boolean bool5, HtpPerformanceMode htpPerformanceMode, Profiling profiling, String str, String str2, Integer num, Integer num2, OptimizationLevel optimizationLevel) {
/* 3 */                 this.logLevel = logLevel;
/* 4 */                 this.useHtpPreference = bool;
/* 5 */                 this.useQint16AsQuint16 = bool2;
/* 6 */                 this.enableWeightSharing = bool3;
/* 7 */                 this.dumpTensorIds = list;
/* 8 */                 this.useConvHmx = bool4;
/* 9 */                 this.useFoldRelu = bool5;
/* 10 */                this.htpPerformanceMode = htpPerformanceMode;
/* 11 */                this.profiling = profiling;
/* 12 */                this.irJsonDir = str;
/* 13 */                this.dlcDir = str2;
/* 14 */                this.vtcmSize = num;
/* 15 */                this.numHvxThreads = num2;
/* 16 */                this.optimizationLevel = optimizationLevel;
                    }

/* 16 */            public QualcommOptions() {
/* 17 */                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
                    }

                    @IiO0I1oi0
/* 19 */            public static void getUseHtpPreference$annotations() {
                    }

                    @IiO0I1oi0
/* 19 */            public static void getUseQint16AsQuint16$annotations() {
                    }
                }

                static {
/* 11 */            System.loadLibrary("LiteRt");
                }

                public CompiledModel(long j, Environment environment, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 6 */             this(j, environment, (i & 4) != 0 ? false : z);
                }

                public static final CompiledModel create(AssetManager assetManager, String str) {
/* 3 */             return INSTANCE.create(assetManager, str);
                }

                public static TensorBuffer createInputBuffer$default(CompiledModel compiledModel, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str2 = "";
                    }
/* 7 */             return compiledModel.createInputBuffer(str, str2);
                }

                public static List createInputBuffers$default(CompiledModel compiledModel, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 6 */             return compiledModel.createInputBuffers(i);
                }

                public static TensorBuffer createOutputBuffer$default(CompiledModel compiledModel, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str2 = "";
                    }
/* 7 */             return compiledModel.createOutputBuffer(str, str2);
                }

                public static List createOutputBuffers$default(CompiledModel compiledModel, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 6 */             return compiledModel.createOutputBuffers(i);
                }

                public static TensorBufferRequirements getInputBufferRequirements$default(CompiledModel compiledModel, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str2 = "";
                    }
/* 7 */             return compiledModel.getInputBufferRequirements(str, str2);
                }

                public static TensorType getInputTensorType$default(CompiledModel compiledModel, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str2 = "";
                    }
/* 7 */             return compiledModel.getInputTensorType(str, str2);
                }

                public static TensorBufferRequirements getOutputBufferRequirements$default(CompiledModel compiledModel, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str2 = "";
                    }
/* 7 */             return compiledModel.getOutputBufferRequirements(str, str2);
                }

                public static TensorType getOutputTensorType$default(CompiledModel compiledModel, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str2 = "";
                    }
/* 7 */             return compiledModel.getOutputTensorType(str, str2);
                }

                private static final native long nativeCreateFromAsset(long j, AssetManager assetManager, String str, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, String[] strArr2, int[] iArr4, String[] strArr3);

                private static final native long nativeCreateFromFile(long j, String str, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, String[] strArr2, int[] iArr4, String[] strArr3);

                private static final native long nativeCreateInputBuffer(long j, String str, String str2);

                private static final native long[] nativeCreateInputBuffers(long j, int i);

                private static final native long[] nativeCreateInputBuffersBySignature(long j, String str);

                private static final native long nativeCreateOutputBuffer(long j, String str, String str2);

                private static final native long[] nativeCreateOutputBuffers(long j, int i);

                private static final native long[] nativeCreateOutputBuffersBySignature(long j, String str);

                private static final native void nativeDestroy(long j);

                private static final native TensorBufferRequirements nativeGetInputBufferRequirements(long j, String str, String str2);

                private static final native TensorType nativeGetInputTensorType(long j, String str, String str2);

                private static final native TensorBufferRequirements nativeGetOutputBufferRequirements(long j, String str, String str2);

                private static final native TensorType nativeGetOutputTensorType(long j, String str, String str2);

                private static final native void nativeRun(long j, int i, long[] jArr, long[] jArr2);

                private static final native void nativeRunBySignature(long j, String str, long[] jArr, long[] jArr2);

                private static final native void nativeRunBySignatureWithMap(long j, String str, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

                public static List run$default(CompiledModel compiledModel, List list, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = 0;
                    }
/* 6 */             return compiledModel.run((List<TensorBuffer>) list, i);
                }

                public final TensorBuffer createInputBuffer(String inputName, String signature) {
/* 1 */             assertNotDestroyed();
/* 16 */            return new TensorBuffer(INSTANCE.nativeCreateInputBuffer(getHandle(), signature, inputName));
                }

                public final List<TensorBuffer> createInputBuffers(int signatureIndex) {
/* 1 */             assertNotDestroyed();
/* 1 */             long[] jArrNativeCreateInputBuffers = INSTANCE.nativeCreateInputBuffers(getHandle(), signatureIndex);
/* 17 */            ArrayList arrayList = new ArrayList(jArrNativeCreateInputBuffers.length);
/* 22 */            for (long j : jArrNativeCreateInputBuffers) {
/* 31 */                arrayList.add(new TensorBuffer(j));
                    }
/* 77 */            return arrayList;
                }

                public final TensorBuffer createOutputBuffer(String outputName, String signature) {
/* 1 */             assertNotDestroyed();
/* 16 */            return new TensorBuffer(INSTANCE.nativeCreateOutputBuffer(getHandle(), signature, outputName));
                }

                public final List<TensorBuffer> createOutputBuffers(int signatureIndex) {
/* 1 */             assertNotDestroyed();
/* 1 */             long[] jArrNativeCreateOutputBuffers = INSTANCE.nativeCreateOutputBuffers(getHandle(), signatureIndex);
/* 17 */            ArrayList arrayList = new ArrayList(jArrNativeCreateOutputBuffers.length);
/* 22 */            for (long j : jArrNativeCreateOutputBuffers) {
/* 31 */                arrayList.add(new TensorBuffer(j));
                    }
/* 77 */            return arrayList;
                }

                @Override
                public void destroy() {
/* 1 */             INSTANCE.nativeDestroy(getHandle());
/* 12 */            if (this.envManaged) {
/* 16 */                this.env.close();
                    }
                }

                public final TensorBufferRequirements getInputBufferRequirements(String inputName, String signature) {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeGetInputBufferRequirements(getHandle(), signature, inputName);
                }

                public final TensorType getInputTensorType(String inputName, String signature) {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeGetInputTensorType(getHandle(), inputName, signature);
                }

                public final TensorBufferRequirements getOutputBufferRequirements(String outputName, String signature) {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeGetOutputBufferRequirements(getHandle(), signature, outputName);
                }

                public final TensorType getOutputTensorType(String outputName, String signature) {
/* 1 */             assertNotDestroyed();
/* 1 */             return INSTANCE.nativeGetOutputTensorType(getHandle(), outputName, signature);
                }

                public final void run(Map<String, TensorBuffer> inputs, Map<String, TensorBuffer> outputs, String signature) {
/* 1 */             assertNotDestroyed();
/* 4 */             Companion companion = INSTANCE;
/* 6 */             long handle = getHandle();
/* 24 */            String[] strArr = (String[]) inputs.keySet().toArray(new String[0]);
/* 26 */            Collection<TensorBuffer> collectionValues = inputs.values();
/* 40 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionValues, 10));
/* 43 */            Iterator<T> it = collectionValues.iterator();
/* 51 */            while (it.hasNext()) {
/* 67 */                arrayList.add(Long.valueOf(((TensorBuffer) it.next()).getHandle()));
                    }
/* 71 */            long[] jArrI00iOIl = IOOi0Ool1i.I00iOIl(arrayList);
/* 88 */            String[] strArr2 = (String[]) outputs.keySet().toArray(new String[0]);
/* 90 */            Collection<TensorBuffer> collectionValues2 = outputs.values();
/* 102 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(collectionValues2, 10));
/* 105 */           Iterator<T> it2 = collectionValues2.iterator();
/* 113 */           while (it2.hasNext()) {
/* 129 */               arrayList2.add(Long.valueOf(((TensorBuffer) it2.next()).getHandle()));
                    }
/* 1 */             companion.nativeRunBySignatureWithMap(handle, signature, strArr, jArrI00iOIl, strArr2, IOOi0Ool1i.I00iOIl(arrayList2));
                }

                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$Options;", "", "accelerators", "", "Lcom/google/ai/edge/litert/Accelerator;", "<init>", "(Ljava/util/Set;)V", "", "([Lcom/google/ai/edge/litert/Accelerator;)V", "getAccelerators$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "()Ljava/util/Set;", "cpuOptions", "Lcom/google/ai/edge/litert/CompiledModel$CpuOptions;", "getCpuOptions", "()Lcom/google/ai/edge/litert/CompiledModel$CpuOptions;", "setCpuOptions", "(Lcom/google/ai/edge/litert/CompiledModel$CpuOptions;)V", "gpuOptions", "Lcom/google/ai/edge/litert/CompiledModel$GpuOptions;", "getGpuOptions", "()Lcom/google/ai/edge/litert/CompiledModel$GpuOptions;", "setGpuOptions", "(Lcom/google/ai/edge/litert/CompiledModel$GpuOptions;)V", "qualcommOptions", "Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions;", "getQualcommOptions", "()Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions;", "setQualcommOptions", "(Lcom/google/ai/edge/litert/CompiledModel$QualcommOptions;)V", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */         public static final class Options {
                    private final Set<Accelerator> accelerators;
                    private CpuOptions cpuOptions;
                    private GpuOptions gpuOptions;
                    private QualcommOptions qualcommOptions;

                    public static final Companion INSTANCE = new Companion(null);
                    private static final Options CPU = new Options(Accelerator.CPU);

                    public Options(Accelerator... acceleratorArr) {
/* 10 */                this((Set<? extends Accelerator>) I1IoiO1l.I00IlilI0i0i(Arrays.copyOf(acceleratorArr, acceleratorArr.length)));
                    }

                    public static final Options getCPU() {
/* 3 */                 return INSTANCE.getCPU();
                    }

                    public final Set<Accelerator> m5x85680661() {
/* 1 */                 return this.accelerators;
                    }

                    public final CpuOptions getCpuOptions() {
/* 1 */                 return this.cpuOptions;
                    }

                    public final GpuOptions getGpuOptions() {
/* 1 */                 return this.gpuOptions;
                    }

                    public final QualcommOptions getQualcommOptions() {
/* 1 */                 return this.qualcommOptions;
                    }

                    public final void setCpuOptions(CpuOptions cpuOptions) {
/* 1 */                 this.cpuOptions = cpuOptions;
                    }

                    public final void setGpuOptions(GpuOptions gpuOptions) {
/* 1 */                 this.gpuOptions = gpuOptions;
                    }

                    public final void setQualcommOptions(QualcommOptions qualcommOptions) {
/* 1 */                 this.qualcommOptions = qualcommOptions;
                    }

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$Options$Companion;", "", "<init>", "()V", "CPU", "Lcom/google/ai/edge/litert/CompiledModel$Options;", "getCPU$annotations", "getCPU", "()Lcom/google/ai/edge/litert/CompiledModel$Options;", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */             public static final class Companion {
                        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                     this();
                        }

                        public final Options getCPU() {
/* 1 */                     return Options.CPU;
                        }

/* 4 */                 private Companion() {
                        }

/* 19 */                public static void getCPU$annotations() {
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 13 */            public Options(Set<? extends Accelerator> set) {
                        this.accelerators = set;
                    }
                }

                @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u0010J?\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b!\u0010\u001cJ(\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\"\u0010\u001fJ \u0010&\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0083 ¢\u0006\u0004\b&\u0010'J \u0010(\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0083 ¢\u0006\u0004\b*\u0010'J \u0010+\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b+\u0010)J0\u0010/\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0083 ¢\u0006\u0004\b/\u00100J0\u00101\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0083 ¢\u0006\u0004\b1\u00102J(\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b5\u00106J(\u00107\u001a\u0002042\u0006\u00103\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b7\u00106J\u0018\u00108\u001a\u00020.2\u0006\u00103\u001a\u00020\u0017H\u0083 ¢\u0006\u0004\b8\u00109Jr\u0010D\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060>2\u0006\u0010@\u001a\u00020;2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060>2\u0006\u0010B\u001a\u00020;2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0083 ¢\u0006\u0004\bD\u0010EJj\u0010F\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060>2\u0006\u0010@\u001a\u00020;2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060>2\u0006\u0010B\u001a\u00020;2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060>H\u0083 ¢\u0006\u0004\bF\u0010GJL\u0010J\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060>2\u0006\u0010,\u001a\u00020%2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060>2\u0006\u0010-\u001a\u00020%H\u0083 ¢\u0006\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$Companion;", "", "<init>", "()V", "Landroid/content/res/AssetManager;", "assetManager", "", "assetName", "Lcom/google/ai/edge/litert/CompiledModel$Options;", "options", "Lcom/google/ai/edge/litert/Environment;", "optionalEnv", "Lcom/google/ai/edge/litert/CompiledModel;", "create", "(Landroid/content/res/AssetManager;Ljava/lang/String;Lcom/google/ai/edge/litert/CompiledModel$Options;Lcom/google/ai/edge/litert/Environment;)Lcom/google/ai/edge/litert/CompiledModel;", "filePath", "(Ljava/lang/String;Lcom/google/ai/edge/litert/CompiledModel$Options;Lcom/google/ai/edge/litert/Environment;)Lcom/google/ai/edge/litert/CompiledModel;", "", "envManaged", "createFromAsset", "(Landroid/content/res/AssetManager;Ljava/lang/String;Lcom/google/ai/edge/litert/CompiledModel$Options;Lcom/google/ai/edge/litert/Environment;Z)Lcom/google/ai/edge/litert/CompiledModel;", "createFromFile", "(Ljava/lang/String;Lcom/google/ai/edge/litert/CompiledModel$Options;Lcom/google/ai/edge/litert/Environment;Z)Lcom/google/ai/edge/litert/CompiledModel;", "", "compiledModelHandle", "signature", "inputName", "nativeCreateInputBuffer", "(JLjava/lang/String;Ljava/lang/String;)J", "Lcom/google/ai/edge/litert/TensorBufferRequirements;", "nativeGetInputBufferRequirements", "(JLjava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/litert/TensorBufferRequirements;", "outputName", "nativeCreateOutputBuffer", "nativeGetOutputBufferRequirements", "", "signatureIndex", "", "nativeCreateInputBuffers", "(JI)[J", "nativeCreateInputBuffersBySignature", "(JLjava/lang/String;)[J", "nativeCreateOutputBuffers", "nativeCreateOutputBuffersBySignature", "inputBuffers", "outputBuffers", "LOoiIlOl1iI;", "nativeRun", "(JI[J[J)V", "nativeRunBySignature", "(JLjava/lang/String;[J[J)V", "handle", "Lcom/google/ai/edge/litert/TensorType;", "nativeGetInputTensorType", "(JLjava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/litert/TensorType;", "nativeGetOutputTensorType", "nativeDestroy", "(J)V", "envHandle", "", "accelerators", "cpuOptionsKeys", "", "cpuOptionsValues", "gpuOptionsKeys", "gpuOptionsValues", "qualcommOptionsKeys", "qualcommOptionsValues", "nativeCreateFromAsset", "(JLandroid/content/res/AssetManager;Ljava/lang/String;[I[ILkotlin/Array;[ILkotlin/Array;[ILkotlin/Array;)J", "nativeCreateFromFile", "(JLjava/lang/String;[I[ILkotlin/Array;[ILkotlin/Array;[ILkotlin/Array;)J", "inputKeys", "outputKeys", "nativeRunBySignatureWithMap", "(JLjava/lang/String;Lkotlin/Array;[JLkotlin/Array;[J)V", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public static CompiledModel create$default(Companion companion, AssetManager assetManager, String str, Options options, Environment environment, int i, Object obj) {
/* 3 */                 if ((i & 4) != 0) {
/* 7 */                     options = Options.INSTANCE.getCPU();
                        }
/* 13 */                if ((i & 8) != 0) {
/* 15 */                    environment = null;
                        }
/* 16 */                return companion.create(assetManager, str, options, environment);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private final CompiledModel createFromAsset(AssetManager assetManager, String assetName, Options options, Environment optionalEnv, boolean envManaged) {
                        Set<Accelerator> setI00IlilI0i0i;
                        Map<CpuOptions.Key, String> map$third_party_odml_litert_litert_kotlin_litert_kotlin_api;
                        Map<GpuOptions.Key, String> map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2;
                        Map<QualcommOptions.Key, String> map$third_party_odml_litert_litert_kotlin_litert_kotlin_api3;
/* 13 */                Environment environmentCreate$default = optionalEnv == null ? Environment.Companion.create$default(Environment.INSTANCE, null, 1, null) : optionalEnv;
/* 23 */                if (options.m5x85680661().size() == 1) {
/* 31 */                    Object objI001lIiIIo1O = IOOi0Ool1i.I001lIiIIo1O(options.m5x85680661());
/* 35 */                    Accelerator accelerator = Accelerator.NPU;
/* 50 */                    setI00IlilI0i0i = objI001lIiIIo1O == accelerator ? I1IoiO1l.I00IlilI0i0i(new Accelerator[]{accelerator, Accelerator.CPU}) : options.m5x85680661();
                        }
/* 54 */                CpuOptions cpuOptions = options.getCpuOptions();
/* 58 */                Map<CpuOptions.Key, String> map = Il011I1OiO0I.I00iOIl;
/* 60 */                if (cpuOptions == null || (map$third_party_odml_litert_litert_kotlin_litert_kotlin_api = cpuOptions.toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api()) == null) {
/* 68 */                    map$third_party_odml_litert_litert_kotlin_litert_kotlin_api = map;
                        }
/* 69 */                GpuOptions gpuOptions = options.getGpuOptions();
/* 73 */                if (gpuOptions == null || (map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2 = gpuOptions.toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api()) == null) {
/* 81 */                    map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2 = map;
                        }
/* 82 */                QualcommOptions qualcommOptions = options.getQualcommOptions();
/* 86 */                if (qualcommOptions != null && (map$third_party_odml_litert_litert_kotlin_litert_kotlin_api3 = qualcommOptions.toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api()) != null) {
/* 95 */                    map = map$third_party_odml_litert_litert_kotlin_litert_kotlin_api3;
                        }
/* 96 */                long handle = environmentCreate$default.getHandle();
/* 100 */               Set<Accelerator> set = setI00IlilI0i0i;
/* 110 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(set, 10));
/* 113 */               Iterator<T> it = set.iterator();
/* 121 */               while (it.hasNext()) {
/* 137 */                   arrayList.add(Integer.valueOf(((Accelerator) it.next()).getValue()));
                        }
/* 141 */               int[] iArrI00iIO = IOOi0Ool1i.I00iIO(arrayList);
/* 145 */               Set<CpuOptions.Key> setKeySet = map$third_party_odml_litert_litert_kotlin_litert_kotlin_api.keySet();
/* 157 */               ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 160 */               Iterator<T> it2 = setKeySet.iterator();
/* 168 */               while (it2.hasNext()) {
/* 184 */                   arrayList2.add(Integer.valueOf(((CpuOptions.Key) it2.next()).getValue()));
                        }
/* 188 */               int[] iArrI00iIO2 = IOOi0Ool1i.I00iIO(arrayList2);
/* 204 */               String[] strArr = (String[]) map$third_party_odml_litert_litert_kotlin_litert_kotlin_api.values().toArray(new String[0]);
/* 206 */               Set<GpuOptions.Key> setKeySet2 = map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2.keySet();
/* 218 */               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(setKeySet2, 10));
/* 221 */               Iterator<T> it3 = setKeySet2.iterator();
/* 229 */               while (it3.hasNext()) {
/* 245 */                   arrayList3.add(Integer.valueOf(((GpuOptions.Key) it3.next()).getValue()));
                        }
/* 249 */               int[] iArrI00iIO3 = IOOi0Ool1i.I00iIO(arrayList3);
/* 264 */               String[] strArr2 = (String[]) map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2.values().toArray(new String[0]);
/* 266 */               Set<CpuOptions.Key> setKeySet3 = map.keySet();
/* 278 */               ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(setKeySet3, 10));
/* 281 */               Iterator<T> it4 = setKeySet3.iterator();
/* 289 */               while (it4.hasNext()) {
/* 305 */                   arrayList4.add(Integer.valueOf(((QualcommOptions.Key) it4.next()).getValue()));
                        }
/* 342 */               return new CompiledModel(nativeCreateFromAsset(handle, assetManager, assetName, iArrI00iIO, iArrI00iIO2, strArr, iArrI00iIO3, strArr2, IOOi0Ool1i.I00iIO(arrayList4), (String[]) map.values().toArray(new String[0])), environmentCreate$default, envManaged, null);
                    }

                    public static CompiledModel createFromAsset$default(Companion companion, AssetManager assetManager, String str, Options options, Environment environment, boolean z, int i, Object obj) {
/* 3 */                 if ((i & 4) != 0) {
/* 7 */                     options = Options.INSTANCE.getCPU();
                        }
/* 11 */                Options options2 = options;
/* 14 */                if ((i & 8) != 0) {
/* 16 */                    environment = null;
                        }
/* 17 */                Environment environment2 = environment;
/* 20 */                if ((i & 16) != 0) {
/* 27 */                    z = environment2 == null;
                        }
/* 33 */                return companion.createFromAsset(assetManager, str, options2, environment2, z);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private final CompiledModel createFromFile(String filePath, Options options, Environment optionalEnv, boolean envManaged) {
                        Set<Accelerator> setI00IlilI0i0i;
                        Map<CpuOptions.Key, String> map$third_party_odml_litert_litert_kotlin_litert_kotlin_api;
                        Map<GpuOptions.Key, String> map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2;
                        Map<QualcommOptions.Key, String> map$third_party_odml_litert_litert_kotlin_litert_kotlin_api3;
/* 13 */                Environment environmentCreate$default = optionalEnv == null ? Environment.Companion.create$default(Environment.INSTANCE, null, 1, null) : optionalEnv;
/* 23 */                if (options.m5x85680661().size() == 1) {
/* 31 */                    Object objI001lIiIIo1O = IOOi0Ool1i.I001lIiIIo1O(options.m5x85680661());
/* 35 */                    Accelerator accelerator = Accelerator.NPU;
/* 50 */                    setI00IlilI0i0i = objI001lIiIIo1O == accelerator ? I1IoiO1l.I00IlilI0i0i(new Accelerator[]{accelerator, Accelerator.CPU}) : options.m5x85680661();
                        }
/* 54 */                CpuOptions cpuOptions = options.getCpuOptions();
/* 58 */                Map<CpuOptions.Key, String> map = Il011I1OiO0I.I00iOIl;
/* 60 */                if (cpuOptions == null || (map$third_party_odml_litert_litert_kotlin_litert_kotlin_api = cpuOptions.toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api()) == null) {
/* 68 */                    map$third_party_odml_litert_litert_kotlin_litert_kotlin_api = map;
                        }
/* 69 */                GpuOptions gpuOptions = options.getGpuOptions();
/* 73 */                if (gpuOptions == null || (map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2 = gpuOptions.toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api()) == null) {
/* 81 */                    map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2 = map;
                        }
/* 82 */                QualcommOptions qualcommOptions = options.getQualcommOptions();
/* 86 */                if (qualcommOptions != null && (map$third_party_odml_litert_litert_kotlin_litert_kotlin_api3 = qualcommOptions.toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api()) != null) {
/* 95 */                    map = map$third_party_odml_litert_litert_kotlin_litert_kotlin_api3;
                        }
/* 96 */                long handle = environmentCreate$default.getHandle();
/* 100 */               Set<Accelerator> set = setI00IlilI0i0i;
/* 110 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(set, 10));
/* 113 */               Iterator<T> it = set.iterator();
/* 121 */               while (it.hasNext()) {
/* 137 */                   arrayList.add(Integer.valueOf(((Accelerator) it.next()).getValue()));
                        }
/* 141 */               int[] iArrI00iIO = IOOi0Ool1i.I00iIO(arrayList);
/* 145 */               Set<CpuOptions.Key> setKeySet = map$third_party_odml_litert_litert_kotlin_litert_kotlin_api.keySet();
/* 157 */               ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 160 */               Iterator<T> it2 = setKeySet.iterator();
/* 168 */               while (it2.hasNext()) {
/* 184 */                   arrayList2.add(Integer.valueOf(((CpuOptions.Key) it2.next()).getValue()));
                        }
/* 188 */               int[] iArrI00iIO2 = IOOi0Ool1i.I00iIO(arrayList2);
/* 204 */               String[] strArr = (String[]) map$third_party_odml_litert_litert_kotlin_litert_kotlin_api.values().toArray(new String[0]);
/* 206 */               Set<GpuOptions.Key> setKeySet2 = map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2.keySet();
/* 218 */               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(setKeySet2, 10));
/* 221 */               Iterator<T> it3 = setKeySet2.iterator();
/* 229 */               while (it3.hasNext()) {
/* 245 */                   arrayList3.add(Integer.valueOf(((GpuOptions.Key) it3.next()).getValue()));
                        }
/* 249 */               int[] iArrI00iIO3 = IOOi0Ool1i.I00iIO(arrayList3);
/* 264 */               String[] strArr2 = (String[]) map$third_party_odml_litert_litert_kotlin_litert_kotlin_api2.values().toArray(new String[0]);
/* 266 */               Set<CpuOptions.Key> setKeySet3 = map.keySet();
/* 278 */               ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(setKeySet3, 10));
/* 281 */               Iterator<T> it4 = setKeySet3.iterator();
/* 289 */               while (it4.hasNext()) {
/* 305 */                   arrayList4.add(Integer.valueOf(((QualcommOptions.Key) it4.next()).getValue()));
                        }
/* 340 */               return new CompiledModel(nativeCreateFromFile(handle, filePath, iArrI00iIO, iArrI00iIO2, strArr, iArrI00iIO3, strArr2, IOOi0Ool1i.I00iIO(arrayList4), (String[]) map.values().toArray(new String[0])), environmentCreate$default, envManaged, null);
                    }

                    public static CompiledModel createFromFile$default(Companion companion, String str, Options options, Environment environment, boolean z, int i, Object obj) {
/* 3 */                 if ((i & 2) != 0) {
/* 7 */                     options = Options.INSTANCE.getCPU();
                        }
/* 13 */                if ((i & 4) != 0) {
/* 15 */                    environment = null;
                        }
/* 18 */                if ((i & 8) != 0) {
/* 24 */                    z = environment == null;
                        }
/* 25 */                return companion.createFromFile(str, options, environment, z);
                    }

                    private final long nativeCreateFromAsset(long j, AssetManager assetManager, String str, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, String[] strArr2, int[] iArr4, String[] strArr3) {
/* 1 */                 return CompiledModel.nativeCreateFromAsset(j, assetManager, str, iArr, iArr2, strArr, iArr3, strArr2, iArr4, strArr3);
                    }

                    private final long nativeCreateFromFile(long j, String str, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, String[] strArr2, int[] iArr4, String[] strArr3) {
/* 1 */                 return CompiledModel.nativeCreateFromFile(j, str, iArr, iArr2, strArr, iArr3, strArr2, iArr4, strArr3);
                    }

                    private final long nativeCreateInputBuffer(long compiledModelHandle, String signature, String inputName) {
/* 1 */                 return CompiledModel.nativeCreateInputBuffer(compiledModelHandle, signature, inputName);
                    }

                    private final long[] nativeCreateInputBuffers(long compiledModelHandle, int signatureIndex) {
/* 1 */                 return CompiledModel.nativeCreateInputBuffers(compiledModelHandle, signatureIndex);
                    }

                    private final long[] nativeCreateInputBuffersBySignature(long compiledModelHandle, String signature) {
/* 1 */                 return CompiledModel.nativeCreateInputBuffersBySignature(compiledModelHandle, signature);
                    }

                    private final long nativeCreateOutputBuffer(long compiledModelHandle, String signature, String outputName) {
/* 1 */                 return CompiledModel.nativeCreateOutputBuffer(compiledModelHandle, signature, outputName);
                    }

                    private final long[] nativeCreateOutputBuffers(long compiledModelHandle, int signatureIndex) {
/* 1 */                 return CompiledModel.nativeCreateOutputBuffers(compiledModelHandle, signatureIndex);
                    }

                    private final long[] nativeCreateOutputBuffersBySignature(long compiledModelHandle, String signature) {
/* 1 */                 return CompiledModel.nativeCreateOutputBuffersBySignature(compiledModelHandle, signature);
                    }

                    private final void nativeDestroy(long handle) {
/* 1 */                 CompiledModel.nativeDestroy(handle);
                    }

                    private final TensorBufferRequirements nativeGetInputBufferRequirements(long compiledModelHandle, String signature, String inputName) {
/* 1 */                 return CompiledModel.nativeGetInputBufferRequirements(compiledModelHandle, signature, inputName);
                    }

                    private final TensorType nativeGetInputTensorType(long handle, String inputName, String signature) {
/* 1 */                 return CompiledModel.nativeGetInputTensorType(handle, inputName, signature);
                    }

                    private final TensorBufferRequirements nativeGetOutputBufferRequirements(long compiledModelHandle, String signature, String outputName) {
/* 1 */                 return CompiledModel.nativeGetOutputBufferRequirements(compiledModelHandle, signature, outputName);
                    }

                    private final TensorType nativeGetOutputTensorType(long handle, String outputName, String signature) {
/* 1 */                 return CompiledModel.nativeGetOutputTensorType(handle, outputName, signature);
                    }

                    private final void nativeRun(long compiledModelHandle, int signatureIndex, long[] inputBuffers, long[] outputBuffers) {
/* 1 */                 CompiledModel.nativeRun(compiledModelHandle, signatureIndex, inputBuffers, outputBuffers);
                    }

                    private final void nativeRunBySignature(long compiledModelHandle, String signature, long[] inputBuffers, long[] outputBuffers) {
/* 1 */                 CompiledModel.nativeRunBySignature(compiledModelHandle, signature, inputBuffers, outputBuffers);
                    }

                    private final void nativeRunBySignatureWithMap(long j, String str, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2) {
/* 1 */                 CompiledModel.nativeRunBySignatureWithMap(j, str, strArr, jArr, strArr2, jArr2);
                    }

                    public final CompiledModel create(AssetManager assetManager, String assetName, Options options, Environment optionalEnv) {
/* 10 */                return createFromAsset$default(this, assetManager, assetName, options, optionalEnv, false, 16, null);
                    }

/* 4 */             private Companion() {
                    }

/* 14 */            public final CompiledModel create(AssetManager assetManager, String str, Options options) {
/* 15 */                return create$default(this, assetManager, str, options, null, 8, null);
                    }

/* 15 */            public final CompiledModel create(String str) {
/* 16 */                return create$default(this, str, null, null, 6, null);
                    }

/* 16 */            public final CompiledModel create(String str, Options options) {
/* 17 */                return create$default(this, str, options, null, 4, null);
                    }

/* 17 */            public final CompiledModel create(AssetManager assetManager, String str) {
/* 18 */                return create$default(this, assetManager, str, null, null, 12, null);
                    }

/* 18 */            public final CompiledModel create(String filePath, Options options, Environment optionalEnv) {
/* 19 */                return createFromFile$default(this, filePath, options, optionalEnv, false, 8, null);
                    }

/* 20 */            public static CompiledModel create$default(Companion companion, String str, Options options, Environment environment, int i, Object obj) {
                        if ((i & 2) != 0) {
/* 21 */                    options = Options.INSTANCE.getCPU();
                        }
                        if ((i & 4) != 0) {
                            environment = null;
                        }
/* 22 */                return companion.create(str, options, environment);
                    }
                }

/* 7 */         public static final CompiledModel create(AssetManager assetManager, String str, Options options) {
/* 8 */             return INSTANCE.create(assetManager, str, options);
                }

/* 8 */         public static final CompiledModel create(AssetManager assetManager, String str, Options options, Environment environment) {
/* 9 */             return INSTANCE.create(assetManager, str, options, environment);
                }

/* 9 */         private CompiledModel(long j, Environment environment, boolean z) {
/* 10 */            super(j);
/* 11 */            this.env = environment;
/* 12 */            this.envManaged = z;
                }

/* 9 */         public static final CompiledModel create(String str) {
/* 10 */            return INSTANCE.create(str);
                }

/* 10 */        public static final CompiledModel create(String str, Options options) {
/* 11 */            return INSTANCE.create(str, options);
                }

/* 10 */        public static void run$default(CompiledModel compiledModel, List list, List list2, int i, int i2, Object obj) {
                    if ((i2 & 4) != 0) {
                        i = 0;
                    }
/* 11 */            compiledModel.run((List<TensorBuffer>) list, (List<TensorBuffer>) list2, i);
                }

/* 11 */        public static final CompiledModel create(String str, Options options, Environment environment) {
/* 12 */            return INSTANCE.create(str, options, environment);
                }

/* 11 */        public static void run$default(CompiledModel compiledModel, Map map, Map map2, String str, int i, Object obj) {
                    if ((i & 4) != 0) {
/* 12 */                str = "";
                    }
/* 13 */            compiledModel.run((Map<String, TensorBuffer>) map, (Map<String, TensorBuffer>) map2, str);
                }

/* 12 */        public CompiledModel(long j, Environment environment, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this(j, environment, z);
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010H\u0000¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$CpuOptions;", "", "numThreads", "", "xnnPackFlags", "xnnPackWeightCachePath", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getNumThreads", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getXnnPackFlags", "getXnnPackWeightCachePath", "()Ljava/lang/String;", "toMap", "", "Lcom/google/ai/edge/litert/CompiledModel$CpuOptions$Key;", "toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/google/ai/edge/litert/CompiledModel$CpuOptions;", "equals", "", "other", "hashCode", "toString", "Key", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 19 */        public static final class CpuOptions {
                    private final Integer numThreads;
                    private final Integer xnnPackFlags;
                    private final String xnnPackWeightCachePath;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/google/ai/edge/litert/CompiledModel$CpuOptions$Key;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NUM_THREADS", "XNNPACK_FLAGS", "XNNPACK_WEIGHT_CACHE_PATH", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Key {
                        private static final Il0lIli0 $ENTRIES;
                        private static final Key[] $VALUES;
                        public static final Key NUM_THREADS = new Key("NUM_THREADS", 0, 0);
                        public static final Key XNNPACK_FLAGS = new Key("XNNPACK_FLAGS", 1, 1);
                        public static final Key XNNPACK_WEIGHT_CACHE_PATH = new Key("XNNPACK_WEIGHT_CACHE_PATH", 2, 2);
                        private final int value;

                        private static final Key[] $values() {
/* 7 */                     return new Key[]{NUM_THREADS, XNNPACK_FLAGS, XNNPACK_WEIGHT_CACHE_PATH};
                        }

                        static {
/* 31 */                    Key[] keyArr$values = $values();
/* 35 */                    $VALUES = keyArr$values;
/* 41 */                    $ENTRIES = ilIII1o11.I00000oIO(keyArr$values);
                        }

                        private Key(String str, int i, int i2) {
/* 4 */                     this.value = i2;
                        }

                        public static Il0lIli0 getEntries() {
/* 1 */                     return $ENTRIES;
                        }

                        public static Key valueOf(String str) {
/* 7 */                     return (Key) Enum.valueOf(Key.class, str);
                        }

                        public static Key[] values() {
/* 7 */                     return (Key[]) $VALUES.clone();
                        }

                        public final int getValue() {
/* 1 */                     return this.value;
                        }
                    }

                    public CpuOptions(Integer num, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 17 */                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
                    }

                    public static CpuOptions copy$default(CpuOptions cpuOptions, Integer num, Integer num2, String str, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     num = cpuOptions.numThreads;
                        }
/* 9 */                 if ((i & 2) != 0) {
/* 11 */                    num2 = cpuOptions.xnnPackFlags;
                        }
/* 15 */                if ((i & 4) != 0) {
/* 17 */                    str = cpuOptions.xnnPackWeightCachePath;
                        }
/* 19 */                return cpuOptions.copy(num, num2, str);
                    }

                    public final Integer getNumThreads() {
/* 1 */                 return this.numThreads;
                    }

                    public final Integer getXnnPackFlags() {
/* 1 */                 return this.xnnPackFlags;
                    }

                    public final String getXnnPackWeightCachePath() {
/* 1 */                 return this.xnnPackWeightCachePath;
                    }

                    public final CpuOptions copy(Integer numThreads, Integer xnnPackFlags, String xnnPackWeightCachePath) {
/* 3 */                 return new CpuOptions(numThreads, xnnPackFlags, xnnPackWeightCachePath);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof CpuOptions)) {
/* 7 */                     return false;
                        }
/* 11 */                CpuOptions cpuOptions = (CpuOptions) other;
                        return O0000Ioio00.I0000O(this.numThreads, cpuOptions.numThreads) && O0000Ioio00.I0000O(this.xnnPackFlags, cpuOptions.xnnPackFlags) && O0000Ioio00.I0000O(this.xnnPackWeightCachePath, cpuOptions.xnnPackWeightCachePath);
                    }

                    public final Integer getNumThreads() {
/* 1 */                 return this.numThreads;
                    }

                    public final Integer getXnnPackFlags() {
/* 1 */                 return this.xnnPackFlags;
                    }

                    public final String getXnnPackWeightCachePath() {
/* 1 */                 return this.xnnPackWeightCachePath;
                    }

                    public int hashCode() {
/* 1 */                 Integer num = this.numThreads;
/* 12 */                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
/* 14 */                Integer num2 = this.xnnPackFlags;
/* 25 */                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 27 */                String str = this.xnnPackWeightCachePath;
/* 36 */                return iHashCode2 + (str != null ? str.hashCode() : 0);
                    }

                    public final Map<Key, String> toMap$third_party_odml_litert_litert_kotlin_litert_kotlin_api() {
/* 3 */                 LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */                 Integer num = this.numThreads;
/* 8 */                 if (num != null) {
/* 20 */                    linkedHashMap.put(Key.NUM_THREADS, String.valueOf(num.intValue()));
                        }
/* 23 */                Integer num2 = this.xnnPackFlags;
/* 25 */                if (num2 != null) {
/* 37 */                    linkedHashMap.put(Key.XNNPACK_FLAGS, String.valueOf(num2.intValue()));
                        }
/* 40 */                String str = this.xnnPackWeightCachePath;
/* 42 */                if (str != null) {
/* 46 */                    linkedHashMap.put(Key.XNNPACK_WEIGHT_CACHE_PATH, str);
                        }
/* 49 */                return O1Oii0O0loo.I000iOII(linkedHashMap);
                    }

                    public String toString() {
/* 1 */                 Integer num = this.numThreads;
/* 3 */                 Integer num2 = this.xnnPackFlags;
/* 5 */                 String str = this.xnnPackWeightCachePath;
/* 11 */                StringBuilder sb = new StringBuilder("CpuOptions(numThreads=");
/* 14 */                sb.append(num);
/* 19 */                sb.append(", xnnPackFlags=");
/* 22 */                sb.append(num2);
/* 27 */                sb.append(", xnnPackWeightCachePath=");
/* 32 */                return IIl001iO0Io.I00100l0(sb, str, ")");
                    }

/* 20 */            public CpuOptions(Integer num, Integer num2, String str) {
/* 22 */                this.numThreads = num;
/* 23 */                this.xnnPackFlags = num2;
/* 24 */                this.xnnPackWeightCachePath = str;
                    }

/* 24 */            public CpuOptions() {
/* 25 */                this(null, null, null, 7, null);
                    }
                }

/* 37 */        public final List<TensorBuffer> createInputBuffers() {
/* 38 */            return createInputBuffers$default(this, 0, 1, null);
                }

/* 37 */        public final List<TensorBuffer> createOutputBuffers() {
/* 38 */            return createOutputBuffers$default(this, 0, 1, null);
                }

/* 38 */        public final List<TensorBuffer> createInputBuffers(String signature) {
/* 39 */            assertNotDestroyed();
/* 1 */             long[] jArrNativeCreateInputBuffersBySignature = INSTANCE.nativeCreateInputBuffersBySignature(getHandle(), signature);
/* 41 */            ArrayList arrayList = new ArrayList(jArrNativeCreateInputBuffersBySignature.length);
                    for (long j : jArrNativeCreateInputBuffersBySignature) {
/* 44 */                arrayList.add(new TensorBuffer(j));
                    }
                    return arrayList;
                }

/* 38 */        public final List<TensorBuffer> createOutputBuffers(String signature) {
/* 39 */            assertNotDestroyed();
/* 1 */             long[] jArrNativeCreateOutputBuffersBySignature = INSTANCE.nativeCreateOutputBuffersBySignature(getHandle(), signature);
/* 41 */            ArrayList arrayList = new ArrayList(jArrNativeCreateOutputBuffersBySignature.length);
                    for (long j : jArrNativeCreateOutputBuffersBySignature) {
/* 44 */                arrayList.add(new TensorBuffer(j));
                    }
                    return arrayList;
                }

/* 142 */       public final void run(List<TensorBuffer> list, List<TensorBuffer> list2) {
/* 143 */           run$default(this, list, list2, 0, 4, (Object) null);
                }

/* 143 */       public final List<TensorBuffer> run(List<TensorBuffer> inputs, int signatureIndex) {
/* 144 */           assertNotDestroyed();
/* 145 */           List<TensorBuffer> listCreateOutputBuffers = createOutputBuffers(signatureIndex);
/* 146 */           run(inputs, listCreateOutputBuffers, signatureIndex);
                    return listCreateOutputBuffers;
                }

/* 146 */       public final List<TensorBuffer> run(List<TensorBuffer> inputs, String signature) {
/* 147 */           assertNotDestroyed();
/* 148 */           List<TensorBuffer> listCreateOutputBuffers = createOutputBuffers(signature);
/* 149 */           run(inputs, listCreateOutputBuffers, signature);
                    return listCreateOutputBuffers;
                }

/* 149 */       public final void run(List<TensorBuffer> inputs, List<TensorBuffer> outputs, int signatureIndex) {
/* 150 */           assertNotDestroyed();
/* 151 */           Companion companion = INSTANCE;
/* 152 */           long handle = getHandle();
/* 153 */           List<TensorBuffer> list = inputs;
/* 154 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 155 */           Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
/* 158 */               arrayList.add(Long.valueOf(((TensorBuffer) it.next()).getHandle()));
                    }
/* 159 */           long[] jArrI00iOIl = IOOi0Ool1i.I00iOIl(arrayList);
/* 160 */           List<TensorBuffer> list2 = outputs;
/* 161 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 162 */           Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
/* 165 */               arrayList2.add(Long.valueOf(((TensorBuffer) it2.next()).getHandle()));
                    }
/* 1 */             companion.nativeRun(handle, signatureIndex, jArrI00iOIl, IOOi0Ool1i.I00iOIl(arrayList2));
                }

/* 167 */       public final void run(List<TensorBuffer> inputs, List<TensorBuffer> outputs, String signature) {
/* 168 */           assertNotDestroyed();
/* 169 */           Companion companion = INSTANCE;
/* 170 */           long handle = getHandle();
/* 171 */           List<TensorBuffer> list = inputs;
/* 172 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 173 */           Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
/* 176 */               arrayList.add(Long.valueOf(((TensorBuffer) it.next()).getHandle()));
                    }
/* 177 */           long[] jArrI00iOIl = IOOi0Ool1i.I00iOIl(arrayList);
/* 178 */           List<TensorBuffer> list2 = outputs;
/* 179 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 180 */           Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
/* 183 */               arrayList2.add(Long.valueOf(((TensorBuffer) it2.next()).getHandle()));
                    }
/* 1 */             companion.nativeRunBySignature(handle, signature, jArrI00iOIl, IOOi0Ool1i.I00iOIl(arrayList2));
                }

/* 185 */       public final List<TensorBuffer> run(List<TensorBuffer> list) {
/* 186 */           return run$default(this, list, 0, 2, null);
                }
            }
