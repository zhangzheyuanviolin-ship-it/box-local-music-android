            package com.google.ai.edge.gallery.ui.common;

            import java.util.UUID;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/google/ai/edge/gallery/ui/common/SavedSystemPrompt;", "", "id", "", "title", "prompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getPrompt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 15 */    public final class SavedSystemPrompt {
                public static final int $stable = 0;
                private final String id;
                private final String prompt;
                private final String title;

                public SavedSystemPrompt(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3);
                }

                public static SavedSystemPrompt copy$default(SavedSystemPrompt savedSystemPrompt, String str, String str2, String str3, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = savedSystemPrompt.id;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = savedSystemPrompt.title;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = savedSystemPrompt.prompt;
                    }
/* 19 */            return savedSystemPrompt.copy(str, str2, str3);
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final String getPrompt() {
/* 1 */             return this.prompt;
                }

                public final SavedSystemPrompt copy(String id, String title, String prompt) {
/* 3 */             return new SavedSystemPrompt(id, title, prompt);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SavedSystemPrompt)) {
/* 7 */                 return false;
                    }
/* 11 */            SavedSystemPrompt savedSystemPrompt = (SavedSystemPrompt) other;
                    return O0000Ioio00.I0000O(this.id, savedSystemPrompt.id) && O0000Ioio00.I0000O(this.title, savedSystemPrompt.title) && O0000Ioio00.I0000O(this.prompt, savedSystemPrompt.prompt);
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final String getPrompt() {
/* 1 */             return this.prompt;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public int hashCode() {
/* 22 */            return this.prompt.hashCode() + Oi010OO0.I000O01llI0(this.id.hashCode() * 31, 31, this.title);
                }

                public String toString() {
/* 1 */             String str = this.id;
/* 3 */             String str2 = this.title;
/* 19 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("SavedSystemPrompt(id=", str, ", title=", str2, ", prompt="), this.prompt, ")");
                }

/* 16 */        public SavedSystemPrompt(String str, String str2, String str3) {
/* 18 */            this.id = str;
/* 19 */            this.title = str2;
/* 20 */            this.prompt = str3;
                }
            }
