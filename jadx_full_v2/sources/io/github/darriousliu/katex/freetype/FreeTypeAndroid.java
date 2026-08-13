            package io.github.darriousliu.katex.freetype;

            import java.nio.ByteBuffer;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.IO11IooOO;
            import p000.IlIi0I0;
            import p000.IoOil1;
            import p000.O0oO1ilo;
            import p000.OI1OOIOiOI1;
            
            @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u000e\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0086 ¢\u0006\u0004\b\u0012\u0010\u0015J'\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0086 ¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0086 ¢\u0006\u0004\b\u0017\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u001f\u0010\u001aJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b \u0010\u001aJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b$\u0010\u001dJ\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b&\u0010\u001dJ\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b'\u0010\u001aJ\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b(\u0010\u001aJ\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b)\u0010\u001aJ\u0018\u0010*\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b*\u0010#J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b+\u0010\u001dJ\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b,\u0010\u001dJ\u0018\u0010-\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b-\u0010\u001dJ\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b.\u0010\u001aJ\u0018\u0010/\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b/\u0010\u001aJ(\u00102\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b2\u00103J0\u00109\u001a\u0002082\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b;\u0010\tJ\u0018\u0010<\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b<\u0010\tJ\u0018\u0010=\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b=\u0010\tJ\u0018\u0010>\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b>\u0010#J \u0010@\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ \u0010D\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u0003H\u0086 ¢\u0006\u0004\bD\u0010FJ\u0018\u0010G\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bG\u0010\tJ \u0010I\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\bI\u0010JJ\u0018\u0010L\u001a\u00020K2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bL\u0010MJ \u0010O\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bO\u0010PJ \u0010R\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\bR\u0010SJ \u0010U\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010T\u001a\u00020!H\u0096 ¢\u0006\u0004\bU\u0010VJ \u0010X\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\bX\u0010YJ\u0018\u0010[\u001a\u00020Z2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b[\u0010\\J \u0010^\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b^\u0010AJ(\u0010a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010_\u001a\u0002042\u0006\u0010`\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\ba\u0010bJ \u0010e\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010d\u001a\u00020cH\u0096 ¢\u0006\u0004\be\u0010fJ(\u0010i\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\bi\u0010jJ(\u0010l\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\bl\u0010jJ8\u0010q\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010m\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\bq\u0010rJ\u0018\u0010t\u001a\u00020\u00032\u0006\u0010s\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bt\u0010\u001aJ\u0018\u0010v\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bv\u0010\u001aJ\u0018\u0010w\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bw\u0010\u001aJ\u0018\u0010x\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bx\u0010\u001aJ\u0018\u0010y\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\by\u0010\u001aJ\u0018\u0010z\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\bz\u0010\u001dJ\u0018\u0010{\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b{\u0010\u001aJ\u0018\u0010|\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b|\u0010\u001dJ\u0018\u0010}\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b}\u0010\u001aJ\u0018\u0010\u007f\u001a\u00020\u00032\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u007f\u0010\u001aJ\u001a\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0080\u0001\u0010\u001aJ\u001a\u0010\u0081\u0001\u001a\u00020K2\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0081\u0001\u0010MJ\u001a\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0082\u0001\u0010\u001dJ\u001a\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0083\u0001\u0010\u001dJ\u001a\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0084\u0001\u0010\u001dJ\u001a\u0010\u0085\u0001\u001a\u00020\u00032\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0085\u0001\u0010\u001aJ\u001a\u0010\u0086\u0001\u001a\u00020\u00032\u0006\u0010~\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0086\u0001\u0010\u001aJ#\u0010\u0088\u0001\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u00032\u0007\u0010\u0087\u0001\u001a\u00020\u000fH\u0096 ¢\u0006\u0005\b\u0088\u0001\u0010AJ\u001b\u0010\u008a\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u008a\u0001\u0010\u001aJ\u001b\u0010\u008b\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u008b\u0001\u0010\u001aJ\u001b\u0010\u008c\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u008c\u0001\u0010\u001aJ\u001b\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u008d\u0001\u0010\u001aJ\u001b\u0010\u008e\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u008e\u0001\u0010\u001aJ\u001b\u0010\u008f\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u008f\u0001\u0010\u001aJ\u001b\u0010\u0090\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0090\u0001\u0010\u001aJ\u001b\u0010\u0091\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0091\u0001\u0010\u001aJ\u001b\u0010\u0093\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0093\u0001\u0010\u001dJ\u001b\u0010\u0094\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0094\u0001\u0010\u001dJ\u001b\u0010\u0095\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0095\u0001\u0010\u001dJ\u001b\u0010\u0096\u0001\u001a\u00020Z2\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u0096\u0001\u0010\\J\u001c\u0010\u0097\u0001\u001a\u0002042\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001c\u0010\u0099\u0001\u001a\u0002042\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0096 ¢\u0006\u0006\b\u0099\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\r2\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001c\u0010\u009c\u0001\u001a\u00020\u00142\u0007\u0010\u0092\u0001\u001a\u00020\u0003H\u0086 ¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u0003H\u0096 ¢\u0006\u0005\b\u009e\u0001\u0010\u001dJ\u001a\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001b\u0010¡\u0001\u001a\u00020\u00142\u0006\u0010s\u001a\u00020\u000fH\u0086 ¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001d\u0010¥\u0001\u001a\u00030¤\u00012\u0007\u0010£\u0001\u001a\u00020\u0014H\u0086 ¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0012\u0010§\u0001\u001a\u00030¤\u0001H\u0002¢\u0006\u0005\b§\u0001\u0010\u0002¨\u0006¨\u0001"}, d2 = {"Lio/github/darriousliu/katex/freetype/FreeTypeAndroid;", "<init>", "()V", "", "init", "()J", "library", "", "doneFreeType", "(J)Z", "Lio/github/darriousliu/katex/freetype/LibraryVersion;", "libraryVersion", "(J)Lio/github/darriousliu/katex/freetype/LibraryVersion;", "LOI1OOIOiOI1;", "data", "", "length", "faceIndex", "newMemoryFace", "(JLOI1OOIOiOI1;IJ)J", "Ljava/nio/ByteBuffer;", "(JLjava/nio/ByteBuffer;IJ)J", "face", "loadMathTable", "(JLOI1OOIOiOI1;I)Z", "getMathTableLength", "(J)J", "(JLjava/nio/ByteBuffer;J)Z", "faceGetAscender", "(J)I", "faceGetDescender", "faceGetFaceFlags", "faceGetFaceIndex", "", "faceGetFamilyName", "(J)Ljava/lang/String;", "faceGetHeight", "faceGetMaxAdvanceHeight", "faceGetMaxAdvanceWidth", "faceGetNumFaces", "faceGetNumGlyphs", "faceGetStyleFlags", "faceGetStyleName", "faceGetUnderlinePosition", "faceGetUnderlineThickness", "faceGetUnitsPerEM", "faceGetGlyph", "faceGetSize", "pointSize", "degree", "getTrackKerning", "(JII)J", "", "left", "right", "mode", "Lio/github/darriousliu/katex/freetype/Kerning;", "getKerning", "(JCCI)Lio/github/darriousliu/katex/freetype/Kerning;", "doneFace", "referenceFace", "hasKerning", "getPostscriptName", "encoding", "selectCharMap", "(JI)Z", "LIO11IooOO;", "charMap", "setCharMap", "(JLIO11IooOO;)Z", "(JJ)Z", "faceCheckTrueTypePatents", "value", "faceSetUnpatentedHinting", "(JZ)Z", "", "getFirstChar", "(J)[J", "charcode", "getNextChar", "(JJ)I", "code", "getCharIndex", "(JI)I", "name", "getNameIndex", "(JLjava/lang/String;)I", "glyphIndex", "getGlyphName", "(JI)Ljava/lang/String;", "", "getFSTypeFlags", "(J)S", "strikeIndex", "selectSize", "c", "flags", "loadChar", "(JCI)Z", "Lio/github/darriousliu/katex/freetype/SizeRequest;", "sizeRequest", "requestSize", "(JLio/github/darriousliu/katex/freetype/SizeRequest;)Z", "width", "height", "setPixelSizes", "(JII)Z", "loadFlags", "loadGlyph", "charWidth", "charHeight", "horizResolution", "vertResolution", "setCharSize", "(JIIII)Z", "size", "sizeGetMetrics", "sizeMetrics", "sizeMetricsGetAscender", "sizeMetricsGetDescender", "sizeMetricsGetHeight", "sizeMetricsGetMaxAdvance", "sizeMetricsGetXPPEM", "sizeMetricsGetXScale", "sizeMetricsGetYPPEM", "sizeMetricsGetYScale", "glyphSlot", "glyphSlotGetLinearHoriAdvance", "glyphSlotGetLinearVertAdvance", "glyphSlotGetAdvance", "glyphSlotGetFormat", "glyphSlotGetBitmapLeft", "glyphSlotGetBitmapTop", "glyphSlotGetBitmap", "glyphSlotGetMetrics", "renderMode", "renderGlyph", "glyphMetrics", "glyphMetricsGetWidth", "glyphMetricsGetHeight", "glyphMetricsGetHoriAdvance", "glyphMetricsGetVertAdvance", "glyphMetricsGetHoriBearingX", "glyphMetricsGetHoriBearingY", "glyphMetricsGetVertBearingX", "glyphMetricsGetVertBearingY", "bitmap", "bitmapGetWidth", "bitmapGetRows", "bitmapGetPitch", "bitmapGetNumGrays", "bitmapGetPaletteMode", "(J)C", "bitmapGetPixelMode", "bitmapGetBuffer", "(J)LOI1OOIOiOI1;", "nativeBitmapGetBuffer", "(J)Ljava/nio/ByteBuffer;", "getCharMapIndex", "newBuffer", "(I)LOI1OOIOiOI1;", "newNativeBuffer", "(I)Ljava/nio/ByteBuffer;", "byteBuffer", "LOoiIlOl1iI;", "deleteNativeBuffer", "(Ljava/nio/ByteBuffer;)V", "loadLibrary", "katex-core_release"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
            public final class FreeTypeAndroid {
                public static final int $stable = 0;
                public static final FreeTypeAndroid INSTANCE;

                static {
/* 3 */             FreeTypeAndroid freeTypeAndroid = new FreeTypeAndroid();
/* 6 */             INSTANCE = freeTypeAndroid;
/* 8 */             freeTypeAndroid.loadLibrary();
                }

                private FreeTypeAndroid() {
                }

                private final void loadLibrary() {
                    try {
/* 3 */                 System.loadLibrary("freetypejni");
                    } catch (Exception e) {
/* 8 */                 e.printStackTrace();
                    } catch (UnsatisfiedLinkError e2) {
/* 17 */                System.err.println("Can't find the native file for FreeType-jni.");
/* 29 */                throw e2;
                    }
                }

                public OI1OOIOiOI1 bitmapGetBuffer(long bitmap) {
/* 7 */             return new OI1OOIOiOI1(nativeBitmapGetBuffer(bitmap));
                }

                public native short bitmapGetNumGrays(long bitmap);

                public native char bitmapGetPaletteMode(long bitmap);

                public native int bitmapGetPitch(long bitmap);

                public native char bitmapGetPixelMode(long bitmap);

                public native int bitmapGetRows(long bitmap);

                public native int bitmapGetWidth(long bitmap);

                public void deleteBuffer(OI1OOIOiOI1 oI1OOIOiOI1) {
/* 5 */             INSTANCE.deleteNativeBuffer(oI1OOIOiOI1.I00000oIO);
                }

                public final native void deleteNativeBuffer(ByteBuffer byteBuffer);

                public native boolean doneFace(long face);

                public native boolean doneFreeType(long library);

                public native boolean faceCheckTrueTypePatents(long face);

                public native int faceGetAscender(long face);

                public native int faceGetDescender(long face);

                public native long faceGetFaceFlags(long face);

                public native long faceGetFaceIndex(long face);

                public native String faceGetFamilyName(long face);

                public native long faceGetGlyph(long face);

                public native int faceGetHeight(long face);

                public native int faceGetMaxAdvanceHeight(long face);

                public native int faceGetMaxAdvanceWidth(long face);

                public native long faceGetNumFaces(long face);

                public native long faceGetNumGlyphs(long face);

                public native long faceGetSize(long face);

                public native long faceGetStyleFlags(long face);

                public native String faceGetStyleName(long face);

                public native int faceGetUnderlinePosition(long face);

                public native int faceGetUnderlineThickness(long face);

                public native int faceGetUnitsPerEM(long face);

                public native boolean faceSetUnpatentedHinting(long face, boolean value);

                public void fillBuffer(byte[] bArr, OI1OOIOiOI1 oI1OOIOiOI1, int i) {
/* 1 */             int length = bArr.length;
/* 2 */             ByteBuffer byteBuffer = oI1OOIOiOI1.I00000oIO;
/* 8 */             if (length > byteBuffer.capacity()) {
/* 23 */                I000II.I000iOII("Failed requirement.");
/* 215 */               return;
                    }
/* 11 */            byteBuffer.position(0);
/* 14 */            byteBuffer.put(bArr);
/* 17 */            byteBuffer.position(0);
                }

                public native int getCharIndex(long face, int code);

                public native int getCharMapIndex(long charMap);

                public native short getFSTypeFlags(long face);

                public native long[] getFirstChar(long face);

                public native String getGlyphName(long face, int glyphIndex);

                public native Kerning getKerning(long face, char left, char right, int mode);

                public final native long getMathTableLength(long face);

                public native int getNameIndex(long face, String name);

                public native int getNextChar(long face, long charcode);

                public native String getPostscriptName(long face);

                public native long getTrackKerning(long face, int pointSize, int degree);

                public native long glyphMetricsGetHeight(long glyphMetrics);

                public native long glyphMetricsGetHoriAdvance(long glyphMetrics);

                public native long glyphMetricsGetHoriBearingX(long glyphMetrics);

                public native long glyphMetricsGetHoriBearingY(long glyphMetrics);

                public native long glyphMetricsGetVertAdvance(long glyphMetrics);

                public native long glyphMetricsGetVertBearingX(long glyphMetrics);

                public native long glyphMetricsGetVertBearingY(long glyphMetrics);

                public native long glyphMetricsGetWidth(long glyphMetrics);

                public native long[] glyphSlotGetAdvance(long glyphSlot);

                public native long glyphSlotGetBitmap(long glyphSlot);

                public native int glyphSlotGetBitmapLeft(long glyphSlot);

                public native int glyphSlotGetBitmapTop(long glyphSlot);

                public native int glyphSlotGetFormat(long glyphSlot);

                public native long glyphSlotGetLinearHoriAdvance(long glyphSlot);

                public native long glyphSlotGetLinearVertAdvance(long glyphSlot);

                public native long glyphSlotGetMetrics(long glyphSlot);

                public native boolean hasKerning(long face);

                public native long init();

                public native LibraryVersion libraryVersion(long library);

                public native boolean loadChar(long face, char c, int flags);

                public native boolean loadGlyph(long face, int glyphIndex, int loadFlags);

                public boolean loadMathTable(long face, OI1OOIOiOI1 data, int length) {
/* 9 */             return loadMathTable(face, data.I00000oIO, getMathTableLength(face));
                }

                public final native boolean loadMathTable(long face, ByteBuffer data, long length);

                public final native ByteBuffer nativeBitmapGetBuffer(long bitmap);

                public OI1OOIOiOI1 newBuffer(int size) {
/* 7 */             return new OI1OOIOiOI1(newNativeBuffer(size));
                }

                public O0oO1ilo newLibrary() {
/* 3 */             long jInit = IoOil1.I00000oIO.init();
/* 11 */            if (jInit == 0) {
/* 17 */                System.out.println((Object) "Failed to initialize FreeType2 library.");
/* 20 */                return null;
                    }
/* 30 */            System.out.println((Object) IlIi0I0.I000iOII(jInit, "Successfully initialized FreeType2 library."));
/* 35 */            return new O0oO1ilo(jInit);
                }

                public long newMemoryFace(long library, OI1OOIOiOI1 data, int length, long faceIndex) {
/* 3 */             return newMemoryFace(library, data.I00000oIO, length, faceIndex);
                }

                public final native long newMemoryFace(long library, ByteBuffer data, int length, long faceIndex);

                public final native ByteBuffer newNativeBuffer(int size);

                public native boolean referenceFace(long face);

                public native boolean renderGlyph(long glyphSlot, int renderMode);

                public native boolean requestSize(long face, SizeRequest sizeRequest);

                public native boolean selectCharMap(long face, int encoding);

                public native boolean selectSize(long face, int strikeIndex);

                public final native boolean setCharMap(long face, long charMap);

                public boolean setCharMap(long face, IO11IooOO charMap) {
/* 89 */            throw null;
                }

                public native boolean setCharSize(long face, int charWidth, int charHeight, int horizResolution, int vertResolution);

                public native boolean setPixelSizes(long face, int width, int height);

                public native long sizeGetMetrics(long size);

                public native long sizeMetricsGetAscender(long sizeMetrics);

                public native long sizeMetricsGetDescender(long sizeMetrics);

                public native long sizeMetricsGetHeight(long sizeMetrics);

                public native long sizeMetricsGetMaxAdvance(long sizeMetrics);

                public native int sizeMetricsGetXPPEM(long sizeMetrics);

                public native long sizeMetricsGetXScale(long sizeMetrics);

                public native int sizeMetricsGetYPPEM(long sizeMetrics);

                public native long sizeMetricsGetYScale(long sizeMetrics);
            }
