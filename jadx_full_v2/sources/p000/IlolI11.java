            package p000;

            import com.google.mlkit.genai.proofreading.Proofreader;
            import com.google.mlkit.genai.rewriting.Rewriter;
            import com.google.mlkit.genai.summarization.Summarizer;
            
/* 28 */    public final class IlolI11 extends IlllollI implements IllOOo00lI {
                public final int I00ioIO = 0;
                public final Ii0110 I00l0I0l0lO1;
                public final OI10i0Il I00l0OO0IO;
                public final OI10i0Il I00li1OI;
                public final OI10i0Il I00ll1;
                public final OI10i0Il I00lli11;
                public final Ol1OlloIO I00lll10;
                public final Object I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlolI11(Ii0110 ii0110, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, Proofreader proofreader, OI10i0Il oI10i0Il3, OI10i0Il oI10i0Il4, Ol1OlloIO ol1OlloIO) {
/* 26 */            super(0, Iooooooil.class, "runProofread", "NanoProofreadContent$runProofread(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/google/mlkit/genai/proofreading/Proofreader;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/material3/SnackbarHostState;)V", 0);
/* 4 */             this.I00l0I0l0lO1 = ii0110;
/* 6 */             this.I00l0OO0IO = oI10i0Il;
/* 8 */             this.I00li1OI = oI10i0Il2;
/* 10 */            this.I00o0iI0io1 = proofreader;
/* 12 */            this.I00ll1 = oI10i0Il3;
/* 14 */            this.I00lli11 = oI10i0Il4;
/* 16 */            this.I00lll10 = ol1OlloIO;
                }

                @Override
                public final Object invoke() {
/* 3 */             int i = this.I00ioIO;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            Object obj = this.I00o0iI0io1;
                    switch (i) {
                        case 0:
/* 88 */                    Proofreader proofreader = (Proofreader) obj;
/* 90 */                    Boolean bool = Boolean.TRUE;
/* 92 */                    OI10i0Il oI10i0Il = this.I00l0OO0IO;
/* 94 */                    oI10i0Il.setValue(bool);
/* 97 */                    OI10i0Il oI10i0Il2 = this.I00li1OI;
/* 99 */                    oI10i0Il2.setValue("");
/* 106 */                   Ii0110 ii0110 = this.I00l0I0l0lO1;
/* 127 */                   iOi1II01i0.I0000O(ii0110, null, null, new IlolIO1OliI(proofreader, ii0110, this.I00ll1, oI10i0Il2, this.I00lli11, this.I00lll10, oI10i0Il, null), 3);
                            break;
                        case 1:
/* 50 */                    Rewriter rewriter = (Rewriter) obj;
/* 52 */                    Boolean bool2 = Boolean.TRUE;
/* 54 */                    OI10i0Il oI10i0Il3 = this.I00l0OO0IO;
/* 56 */                    oI10i0Il3.setValue(bool2);
/* 59 */                    OI10i0Il oI10i0Il4 = this.I00li1OI;
/* 61 */                    oI10i0Il4.setValue("");
/* 68 */                    Ii0110 ii01102 = this.I00l0I0l0lO1;
/* 83 */                    iOi1II01i0.I0000O(ii01102, null, null, new IlolIo0(rewriter, ii01102, this.I00ll1, oI10i0Il4, this.I00lli11, this.I00lll10, oI10i0Il3, null), 3);
                            break;
                        default:
/* 19 */                    Boolean bool3 = Boolean.TRUE;
/* 21 */                    OI10i0Il oI10i0Il5 = this.I00l0OO0IO;
/* 23 */                    oI10i0Il5.setValue(bool3);
/* 26 */                    OI10i0Il oI10i0Il6 = this.I00li1OI;
/* 28 */                    oI10i0Il6.setValue("");
/* 34 */                    Ii0110 ii01103 = this.I00l0I0l0lO1;
/* 45 */                    iOi1II01i0.I0000O(ii01103, null, null, new IlollOO((Summarizer) obj, ii01103, this.I00ll1, oI10i0Il6, this.I00lli11, this.I00lll10, oI10i0Il5, null), 3);
                            break;
                    }
/* 48 */            return ooiIlOl1iI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 29 */        public IlolI11(Ii0110 ii0110, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, Rewriter rewriter, OI10i0Il oI10i0Il3, OI10i0Il oI10i0Il4, Ol1OlloIO ol1OlloIO) {
                    super(0, Iooooooil.class, "runRewrite", "NanoRewriteContent$runRewrite(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/google/mlkit/genai/rewriting/Rewriter;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/material3/SnackbarHostState;)V", 0);
/* 30 */            this.I00l0I0l0lO1 = ii0110;
                    this.I00l0OO0IO = oI10i0Il;
                    this.I00li1OI = oI10i0Il2;
                    this.I00o0iI0io1 = rewriter;
                    this.I00ll1 = oI10i0Il3;
                    this.I00lli11 = oI10i0Il4;
                    this.I00lll10 = ol1OlloIO;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 30 */        public IlolI11(Ii0110 ii0110, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, Summarizer summarizer, OI10i0Il oI10i0Il3, OI10i0Il oI10i0Il4, Ol1OlloIO ol1OlloIO) {
                    super(0, Iooooooil.class, "runSummarize", "NanoSummarizeContent$runSummarize(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/google/mlkit/genai/summarization/Summarizer;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/material3/SnackbarHostState;)V", 0);
/* 31 */            this.I00l0I0l0lO1 = ii0110;
                    this.I00l0OO0IO = oI10i0Il;
                    this.I00li1OI = oI10i0Il2;
                    this.I00o0iI0io1 = summarizer;
                    this.I00ll1 = oI10i0Il3;
                    this.I00lli11 = oI10i0Il4;
                    this.I00lll10 = ol1OlloIO;
                }
            }
