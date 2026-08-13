            package com.google.mlkit.genai.prompt;

            import android.graphics.Bitmap;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.IOOi0Ool1i;
            import p000.IOOii0O10Io0;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\t\nR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/mlkit/genai/prompt/Content;", "", "parts", "", "Lcom/google/mlkit/genai/prompt/Part;", "<init>", "(Ljava/util/List;)V", "getParts", "()Ljava/util/List;", "Builder", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Content {

                public static final Companion INSTANCE = new Companion(null);
                private final List zza;

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001f\u0010\u0004\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/mlkit/genai/prompt/Content$Builder;", "", "<init>", "()V", "parts", "", "Lcom/google/mlkit/genai/prompt/Part;", "addPart", "part", "", "([Lcom/google/mlkit/genai/prompt/Part;)Lcom/google/mlkit/genai/prompt/Content$Builder;", "text", "", "image", "bitmap", "Landroid/graphics/Bitmap;", "build", "Lcom/google/mlkit/genai/prompt/Content;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder {
                    private final List zza = new ArrayList();

                    public final Builder addPart(Part part) {
/* 3 */                 this.zza.add(part);
/* 49 */                return this;
                    }

                    public final Content build() {
/* 1 */                 List list = this.zza;
/* 10 */                DefaultConstructorMarker defaultConstructorMarker = null;
/* 11 */                if (!list.isEmpty()) {
/* 21 */                    return new Content(IOOi0Ool1i.I00iIi0i1o(list), defaultConstructorMarker);
                        }
/* 27 */                I000II.I000iOII("Parts cannot be empty");
/* 10 */                return null;
                    }

                    public final Builder image(Bitmap bitmap) {
/* 6 */                 addPart(new ImagePart(bitmap));
/* 49 */                return this;
                    }

                    public final Builder parts(Part... part) {
/* 5 */                 IOOii0O10Io0.I00100o1O0lo(this.zza, part);
/* 49 */                return this;
                    }

                    public final Builder text(String text) {
/* 6 */                 addPart(new TextPart(text));
/* 49 */                return this;
                    }
                }

                public Content(List list, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this.zza = list;
                }

                public final List<Part> getParts() {
/* 1 */             return this.zza;
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/mlkit/genai/prompt/Content$Companion;", "", "<init>", "()V", "builder", "Lcom/google/mlkit/genai/prompt/Content$Builder;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public final Builder builder() {
/* 3 */                 return new Builder();
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }
            }
