            package com.google.mlkit.genai.prompt.java;

            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import com.google.mlkit.genai.common.StreamingCallback;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0013\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0005H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\f\u001a\u00020\rH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0019H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\u001a\u001a\u00020\u0006H&J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0019H&J\b\u0010\u001b\u001a\u00020\u001cH&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H&¨\u0006\u001f"}, d2 = {"Lcom/google/mlkit/genai/prompt/java/GenerativeModelFutures;", "", "<init>", "()V", "getBaseModelName", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "checkStatus", "", "Lcom/google/mlkit/genai/common/FeatureStatus;", "download", "Ljava/lang/Void;", "callback", "Lcom/google/mlkit/genai/common/DownloadCallback;", "warmup", "countTokens", "Lcom/google/mlkit/genai/prompt/CountTokensResponse;", "request", "Lcom/google/mlkit/genai/prompt/GenerateContentRequest;", "getTokenLimit", "isSystemPromptAvailable", "", "isThinkingModeAvailable", "generateContent", "Lcom/google/mlkit/genai/prompt/GenerateContentResponse;", "Lcom/google/mlkit/genai/common/StreamingCallback;", "prompt", "getGenerativeModel", "Lcom/google/mlkit/genai/prompt/GenerativeModel;", "clearImplicitCaches", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public abstract class GenerativeModelFutures {

                public static final Companion INSTANCE = new Companion(null);

                public static final GenerativeModelFutures from(GenerativeModel generativeModel) {
/* 3 */             return INSTANCE.from(generativeModel);
                }

                public abstract ListenableFuture checkStatus();

                public abstract ListenableFuture clearImplicitCaches();

                public abstract ListenableFuture countTokens(GenerateContentRequest request);

                public abstract ListenableFuture download(DownloadCallback callback);

                public abstract ListenableFuture generateContent(GenerateContentRequest request);

                public abstract ListenableFuture generateContent(GenerateContentRequest request, StreamingCallback callback);

                public abstract ListenableFuture generateContent(String prompt);

                public abstract ListenableFuture generateContent(String prompt, StreamingCallback callback);

                public abstract ListenableFuture getBaseModelName();

                public abstract GenerativeModel getGenerativeModel();

                public abstract ListenableFuture getTokenLimit();

                public abstract ListenableFuture isSystemPromptAvailable();

                public abstract ListenableFuture isThinkingModeAvailable();

                public abstract ListenableFuture warmup();

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/google/mlkit/genai/prompt/java/GenerativeModelFutures$Companion;", "", "<init>", "()V", "from", "Lcom/google/mlkit/genai/prompt/java/GenerativeModelFutures;", "generativeModel", "Lcom/google/mlkit/genai/prompt/GenerativeModel;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public final GenerativeModelFutures from(GenerativeModel generativeModel) {
/* 3 */                 return new zzal(generativeModel);
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }
