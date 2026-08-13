            package com.google.mlkit.genai.prompt;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.Il01100l;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateContentResponse;", "", "candidates", "", "Lcom/google/mlkit/genai/prompt/Candidate;", "thoughtProcess", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCandidates", "()Ljava/util/List;", "getThoughtProcess", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class GenerateContentResponse {

                public static final Companion INSTANCE = new Companion(null);
                private final List zza;
                private final List zzb;

                private GenerateContentResponse(List list, List list2) {
/* 4 */             this.zza = list;
/* 6 */             this.zzb = list2;
                }

                public final List<Candidate> getCandidates() {
/* 1 */             return this.zza;
                }

                public final List<Candidate> getThoughtProcess() {
/* 1 */             return this.zzb;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\n"}, d2 = {"Lcom/google/mlkit/genai/prompt/GenerateContentResponse$Companion;", "", "<init>", "()V", "create", "Lcom/google/mlkit/genai/prompt/GenerateContentResponse;", "candidates", "", "Lcom/google/mlkit/genai/prompt/Candidate;", "thoughtProcess", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static final GenerateContentResponse zza(List list) {
/* 5 */                 return new GenerateContentResponse(list, null, 2, 0 == true ? 1 : 0);
                    }

                    public static final GenerateContentResponse zzb(List list, List list2) {
/* 4 */                 return new GenerateContentResponse(list, list2, null);
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }

/* 8 */         public GenerateContentResponse(List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */             this(list, list2);
                }

/* 9 */         public GenerateContentResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 11 */            this(list, Il01100l.I00iOIl);
                }
            }
