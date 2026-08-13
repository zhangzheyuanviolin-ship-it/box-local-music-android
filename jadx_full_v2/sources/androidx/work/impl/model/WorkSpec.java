            package androidx.work.impl.model;

            import androidx.work.OverwritingInputMerger;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I1o1O1Ii1l0l;
            import p000.IIi0oIl;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.IOOi1I;
            import p000.IOo0o10i1IO;
            import p000.Ii11I1OOII1;
            import p000.IlIi0I0;
            import p000.Illill0o;
            import p000.O0000Ioio00;
            import p000.OIio0Ii1Ii;
            import p000.Oi010OO0;
            import p000.OoOil11Ol1o;
            import p000.i01IOiO1lO;
            import p000.i01OiOoi;
            import p000.i01Ol11;
            import p000.lIiioliIlo;
            
            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\bO\b\u0087\b\u0018\u0000 v2\u00020\u0001:\u0003wxyB\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b.\u0010-J\u001d\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u00105J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u00105J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b=\u0010<J\u0010\u0010>\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b>\u00101J\u0010\u0010?\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b?\u00101J\u0010\u0010@\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b@\u00101J\u0010\u0010A\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bG\u00101J\u0010\u0010H\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bH\u00101J\u0010\u0010I\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bI\u00101J\u0010\u0010J\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bJ\u00101J\u0010\u0010K\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bK\u00103J\u0010\u0010L\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bN\u0010DJ\u0010\u0010O\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bO\u0010DJ\u0010\u0010P\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bP\u00101J\u0010\u0010Q\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bQ\u0010DJ\u0010\u0010R\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bR\u0010DJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00105J\u0012\u0010T\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u008e\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bX\u0010DJ\u001a\u0010Y\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bY\u0010ZR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010[R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010[R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010]R\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010]R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010^R\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010^R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010_R\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010`R\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010aR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010^R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010^R\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010^R\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010^R\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010bR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010cR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010`\u001a\u0004\bd\u0010D\"\u0004\be\u0010fR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010`\u001a\u0004\bg\u0010DR\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010^\u001a\u0004\bh\u00101\"\u0004\bi\u0010-R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010`\u001a\u0004\bj\u0010D\"\u0004\bk\u0010fR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010`\u001a\u0004\bl\u0010DR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010[\u001a\u0004\bm\u00105\"\u0004\bn\u0010oR$\u0010#\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010p\u001a\u0004\bq\u0010U\"\u0004\br\u0010sR\u0011\u0010t\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bt\u00103R\u0011\u0010u\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bu\u00103¨\u0006z"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", "id", "Li01IOiO1lO;", "state", "workerClassName", "inputMergerClassName", "LIi11I1OOII1;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "LIOo0o10i1IO;", "constraints", "", "runAttemptCount", "LI1o1O1Ii1l0l;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "LOIio0Ii1Ii;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Li01IOiO1lO;Ljava/lang/String;Ljava/lang/String;LIi11I1OOII1;LIi11I1OOII1;JJJLIOo0o10i1IO;ILI1o1O1Ii1l0l;JJJJZLOIio0Ii1Ii;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "LOoiIlOl1iI;", "setBackoffDelayDuration", "(J)V", "setPeriodic", "(JJ)V", "calculateNextRunTime", "()J", "hasConstraints", "()Z", "toString", "()Ljava/lang/String;", "component1", "component2", "()Li01IOiO1lO;", "component3", "component4", "component5", "()LIi11I1OOII1;", "component6", "component7", "component8", "component9", "component10", "()LIOo0o10i1IO;", "component11", "()I", "component12", "()LI1o1O1Ii1l0l;", "component13", "component14", "component15", "component16", "component17", "component18", "()LOIio0Ii1Ii;", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Li01IOiO1lO;Ljava/lang/String;Ljava/lang/String;LIi11I1OOII1;LIi11I1OOII1;JJJLIOo0o10i1IO;ILI1o1O1Ii1l0l;JJJJZLOIio0Ii1Ii;IIJIILjava/lang/String;Ljava/lang/Boolean;)Landroidx/work/impl/model/WorkSpec;", "hashCode", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Li01IOiO1lO;", "LIi11I1OOII1;", "J", "LIOo0o10i1IO;", "I", "LI1o1O1Ii1l0l;", "Z", "LOIio0Ii1Ii;", "getPeriodCount", "setPeriodCount", "(I)V", "getGeneration", "getNextScheduleTimeOverride", "setNextScheduleTimeOverride", "getNextScheduleTimeOverrideGeneration", "setNextScheduleTimeOverrideGeneration", "getStopReason", "getTraceTag", "setTraceTag", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getBackOffOnSystemInterruptions", "setBackOffOnSystemInterruptions", "(Ljava/lang/Boolean;)V", "isPeriodic", "isBackedOff", "Companion", "i01Oil0", "i01Ol11", "i01OiOoi", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
/* 8 */     public final class WorkSpec {
                public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
                private Boolean backOffOnSystemInterruptions;
                public long backoffDelayDuration;
                public I1o1O1Ii1l0l backoffPolicy;
                public IOo0o10i1IO constraints;
                public boolean expedited;
                public long flexDuration;
                private final int generation;
                public final String id;
                public long initialDelay;
                public Ii11I1OOII1 input;
                public String inputMergerClassName;
                public long intervalDuration;
                public long lastEnqueueTime;
                public long minimumRetentionDuration;
                private long nextScheduleTimeOverride;
                private int nextScheduleTimeOverrideGeneration;
                public OIio0Ii1Ii outOfQuotaPolicy;
                public Ii11I1OOII1 output;
                private int periodCount;
                public int runAttemptCount;
                public long scheduleRequestedAt;
                public i01IOiO1lO state;
                private final int stopReason;
                private String traceTag;
                public String workerClassName;
                public static final i01OiOoi Companion = new i01OiOoi();
                private static final String TAG = IIi0oIl.I000OiO("WorkSpec");
                public static final Illill0o WORK_INFO_MAPPER = new OoOil11Ol1o();

                public WorkSpec(String str, i01IOiO1lO i01ioio1lo, String str2, String str3, Ii11I1OOII1 ii11I1OOII1, Ii11I1OOII1 ii11I1OOII12, long j, long j2, long j3, IOo0o10i1IO iOo0o10i1IO, int i, I1o1O1Ii1l0l i1o1O1Ii1l0l, long j4, long j5, long j6, long j7, boolean z, OIio0Ii1Ii oIio0Ii1Ii, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool, int i6, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */             this(str, (i6 & 2) != 0 ? i01IOiO1lO.I00iOIl : i01ioio1lo, str2, (i6 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i6 & 16) != 0 ? Ii11I1OOII1.I00000oOI : ii11I1OOII1, (i6 & 32) != 0 ? Ii11I1OOII1.I00000oOI : ii11I1OOII12, (i6 & 64) != 0 ? 0L : j, (i6 & Barcode.FORMAT_ITF) != 0 ? 0L : j2, (i6 & Barcode.FORMAT_QR_CODE) != 0 ? 0L : j3, (i6 & Barcode.FORMAT_UPC_A) != 0 ? IOo0o10i1IO.I000OiO : iOo0o10i1IO, (i6 & Barcode.FORMAT_UPC_E) != 0 ? 0 : i, (i6 & Barcode.FORMAT_PDF417) != 0 ? I1o1O1Ii1l0l.I00iOIl : i1o1O1Ii1l0l, (i6 & Barcode.FORMAT_AZTEC) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) == 0 ? j6 : 0L, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? OIio0Ii1Ii.I00iOIl : oIio0Ii1Ii, (262144 & i6) != 0 ? 0 : i2, (524288 & i6) != 0 ? 0 : i3, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (8388608 & i6) != 0 ? null : str4, (i6 & 16777216) != 0 ? Boolean.FALSE : bool);
                }

                private static final List WORK_INFO_MAPPER$lambda$1(List list) {
/* 1 */             if (list == null) {
/* 41 */                return null;
                    }
/* 3 */             List list2 = list;
/* 13 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 16 */            Iterator it = list2.iterator();
/* 24 */            while (it.hasNext()) {
/* 36 */                arrayList.add(((i01Ol11) it.next()).I00000oIO());
                    }
/* 40 */            return arrayList;
                }

                public static WorkSpec copy$default(WorkSpec workSpec, String str, i01IOiO1lO i01ioio1lo, String str2, String str3, Ii11I1OOII1 ii11I1OOII1, Ii11I1OOII1 ii11I1OOII12, long j, long j2, long j3, IOo0o10i1IO iOo0o10i1IO, int i, I1o1O1Ii1l0l i1o1O1Ii1l0l, long j4, long j5, long j6, long j7, boolean z, OIio0Ii1Ii oIio0Ii1Ii, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool, int i6, Object obj) {
                    Boolean bool2;
                    String str5;
                    long j9;
                    long j10;
                    long j11;
                    long j12;
                    OIio0Ii1Ii oIio0Ii1Ii2;
                    int i7;
                    int i8;
                    long j13;
                    int i9;
                    i01IOiO1lO i01ioio1lo2;
                    int i10;
                    boolean z2;
                    String str6;
                    String str7;
                    Ii11I1OOII1 ii11I1OOII13;
                    Ii11I1OOII1 ii11I1OOII14;
                    long j14;
                    long j15;
                    long j16;
                    IOo0o10i1IO iOo0o10i1IO2;
                    int i11;
                    I1o1O1Ii1l0l i1o1O1Ii1l0l2;
/* 1 */             String str8 = (i6 & 1) != 0 ? workSpec.id : str;
                    i01IOiO1lO i01ioio1lo3 = (i6 & 2) != 0 ? workSpec.state : i01ioio1lo;
                    String str9 = (i6 & 4) != 0 ? workSpec.workerClassName : str2;
                    String str10 = (i6 & 8) != 0 ? workSpec.inputMergerClassName : str3;
                    Ii11I1OOII1 ii11I1OOII15 = (i6 & 16) != 0 ? workSpec.input : ii11I1OOII1;
                    Ii11I1OOII1 ii11I1OOII16 = (i6 & 32) != 0 ? workSpec.output : ii11I1OOII12;
                    long j17 = (i6 & 64) != 0 ? workSpec.initialDelay : j;
                    long j18 = (i6 & Barcode.FORMAT_ITF) != 0 ? workSpec.intervalDuration : j2;
                    long j19 = (i6 & Barcode.FORMAT_QR_CODE) != 0 ? workSpec.flexDuration : j3;
                    IOo0o10i1IO iOo0o10i1IO3 = (i6 & Barcode.FORMAT_UPC_A) != 0 ? workSpec.constraints : iOo0o10i1IO;
                    int i12 = (i6 & Barcode.FORMAT_UPC_E) != 0 ? workSpec.runAttemptCount : i;
                    String str11 = str8;
                    I1o1O1Ii1l0l i1o1O1Ii1l0l3 = (i6 & Barcode.FORMAT_PDF417) != 0 ? workSpec.backoffPolicy : i1o1O1Ii1l0l;
                    i01IOiO1lO i01ioio1lo4 = i01ioio1lo3;
                    long j20 = (i6 & Barcode.FORMAT_AZTEC) != 0 ? workSpec.backoffDelayDuration : j4;
                    long j21 = (i6 & 8192) != 0 ? workSpec.lastEnqueueTime : j5;
                    long j22 = (i6 & 16384) != 0 ? workSpec.minimumRetentionDuration : j6;
                    long j23 = (i6 & 32768) != 0 ? workSpec.scheduleRequestedAt : j7;
                    boolean z3 = (i6 & 65536) != 0 ? workSpec.expedited : z;
                    long j24 = j23;
                    OIio0Ii1Ii oIio0Ii1Ii3 = (i6 & 131072) != 0 ? workSpec.outOfQuotaPolicy : oIio0Ii1Ii;
                    int i13 = (i6 & 262144) != 0 ? workSpec.periodCount : i2;
                    OIio0Ii1Ii oIio0Ii1Ii4 = oIio0Ii1Ii3;
                    int i14 = (i6 & 524288) != 0 ? workSpec.generation : i3;
                    int i15 = i13;
                    long j25 = (i6 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j8;
                    int i16 = (i6 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i4;
                    int i17 = (i6 & 4194304) != 0 ? workSpec.stopReason : i5;
                    int i18 = i16;
                    String str12 = (i6 & 8388608) != 0 ? workSpec.traceTag : str4;
                    if ((i6 & 16777216) != 0) {
                        str5 = str12;
                        bool2 = workSpec.backOffOnSystemInterruptions;
                        j10 = j21;
                        j11 = j22;
                        j12 = j24;
                        oIio0Ii1Ii2 = oIio0Ii1Ii4;
                        i7 = i15;
                        i8 = i14;
                        j13 = j25;
                        i9 = i18;
                        i10 = i17;
                        z2 = z3;
                        str7 = str10;
                        ii11I1OOII13 = ii11I1OOII15;
                        ii11I1OOII14 = ii11I1OOII16;
                        j14 = j17;
                        j15 = j18;
                        j16 = j19;
                        iOo0o10i1IO2 = iOo0o10i1IO3;
                        i11 = i12;
                        i1o1O1Ii1l0l2 = i1o1O1Ii1l0l3;
                        j9 = j20;
                        i01ioio1lo2 = i01ioio1lo4;
                        str6 = str9;
                    } else {
                        bool2 = bool;
                        str5 = str12;
                        j9 = j20;
                        j10 = j21;
                        j11 = j22;
                        j12 = j24;
                        oIio0Ii1Ii2 = oIio0Ii1Ii4;
                        i7 = i15;
                        i8 = i14;
                        j13 = j25;
                        i9 = i18;
                        i01ioio1lo2 = i01ioio1lo4;
                        i10 = i17;
                        z2 = z3;
                        str6 = str9;
                        str7 = str10;
                        ii11I1OOII13 = ii11I1OOII15;
                        ii11I1OOII14 = ii11I1OOII16;
                        j14 = j17;
                        j15 = j18;
                        j16 = j19;
                        iOo0o10i1IO2 = iOo0o10i1IO3;
                        i11 = i12;
                        i1o1O1Ii1l0l2 = i1o1O1Ii1l0l3;
                    }
                    return workSpec.copy(str11, i01ioio1lo2, str6, str7, ii11I1OOII13, ii11I1OOII14, j14, j15, j16, iOo0o10i1IO2, i11, i1o1O1Ii1l0l2, j9, j10, j11, j12, z2, oIio0Ii1Ii2, i7, i8, j13, i9, i10, str5, bool2);
                }

                public final long calculateNextRunTime() {
/* 3 */             i01OiOoi i01oiooi = Companion;
/* 5 */             boolean zIsBackedOff = isBackedOff();
/* 9 */             int i = this.runAttemptCount;
/* 11 */            I1o1O1Ii1l0l i1o1O1Ii1l0l = this.backoffPolicy;
/* 13 */            long j = this.backoffDelayDuration;
/* 15 */            long j2 = this.lastEnqueueTime;
/* 17 */            int i2 = this.periodCount;
/* 19 */            boolean zIsPeriodic = isPeriodic();
/* 23 */            long j3 = this.initialDelay;
/* 25 */            long j4 = this.flexDuration;
/* 30 */            long j5 = this.intervalDuration;
/* 34 */            long j6 = this.nextScheduleTimeOverride;
/* 36 */            i01oiooi.getClass();
/* 45 */            return i01OiOoi.I00000oIO(zIsBackedOff, i, i1o1O1Ii1l0l, j, j2, i2, zIsPeriodic, j3, j4, j5, j6);
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final IOo0o10i1IO getConstraints() {
/* 1 */             return this.constraints;
                }

                public final int getRunAttemptCount() {
/* 1 */             return this.runAttemptCount;
                }

                public final I1o1O1Ii1l0l getBackoffPolicy() {
/* 1 */             return this.backoffPolicy;
                }

                public final long getBackoffDelayDuration() {
/* 1 */             return this.backoffDelayDuration;
                }

                public final long getLastEnqueueTime() {
/* 1 */             return this.lastEnqueueTime;
                }

                public final long getMinimumRetentionDuration() {
/* 1 */             return this.minimumRetentionDuration;
                }

                public final long getScheduleRequestedAt() {
/* 1 */             return this.scheduleRequestedAt;
                }

                public final boolean getExpedited() {
/* 1 */             return this.expedited;
                }

                public final OIio0Ii1Ii getOutOfQuotaPolicy() {
/* 1 */             return this.outOfQuotaPolicy;
                }

                public final int getPeriodCount() {
/* 1 */             return this.periodCount;
                }

                public final i01IOiO1lO getState() {
/* 1 */             return this.state;
                }

                public final int getGeneration() {
/* 1 */             return this.generation;
                }

                public final long getNextScheduleTimeOverride() {
/* 1 */             return this.nextScheduleTimeOverride;
                }

                public final int getNextScheduleTimeOverrideGeneration() {
/* 1 */             return this.nextScheduleTimeOverrideGeneration;
                }

                public final int getStopReason() {
/* 1 */             return this.stopReason;
                }

                public final String getTraceTag() {
/* 1 */             return this.traceTag;
                }

                public final Boolean getBackOffOnSystemInterruptions() {
/* 1 */             return this.backOffOnSystemInterruptions;
                }

                public final String getWorkerClassName() {
/* 1 */             return this.workerClassName;
                }

                public final String getInputMergerClassName() {
/* 1 */             return this.inputMergerClassName;
                }

                public final Ii11I1OOII1 getInput() {
/* 1 */             return this.input;
                }

                public final Ii11I1OOII1 getOutput() {
/* 1 */             return this.output;
                }

                public final long getInitialDelay() {
/* 1 */             return this.initialDelay;
                }

                public final long getIntervalDuration() {
/* 1 */             return this.intervalDuration;
                }

                public final long getFlexDuration() {
/* 1 */             return this.flexDuration;
                }

                public final WorkSpec copy(String id, i01IOiO1lO state, String workerClassName, String inputMergerClassName, Ii11I1OOII1 input, Ii11I1OOII1 output, long initialDelay, long intervalDuration, long flexDuration, IOo0o10i1IO constraints, int runAttemptCount, I1o1O1Ii1l0l backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, OIio0Ii1Ii outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, String traceTag, Boolean backOffOnSystemInterruptions) {
/* 1 */             return new WorkSpec(id, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag, backOffOnSystemInterruptions);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof WorkSpec)) {
/* 7 */                 return false;
                    }
/* 11 */            WorkSpec workSpec = (WorkSpec) other;
                    return O0000Ioio00.I0000O(this.id, workSpec.id) && this.state == workSpec.state && O0000Ioio00.I0000O(this.workerClassName, workSpec.workerClassName) && O0000Ioio00.I0000O(this.inputMergerClassName, workSpec.inputMergerClassName) && O0000Ioio00.I0000O(this.input, workSpec.input) && O0000Ioio00.I0000O(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && O0000Ioio00.I0000O(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && O0000Ioio00.I0000O(this.traceTag, workSpec.traceTag) && O0000Ioio00.I0000O(this.backOffOnSystemInterruptions, workSpec.backOffOnSystemInterruptions);
                }

                public final Boolean getBackOffOnSystemInterruptions() {
/* 1 */             return this.backOffOnSystemInterruptions;
                }

                public final int getGeneration() {
/* 1 */             return this.generation;
                }

                public final long getNextScheduleTimeOverride() {
/* 1 */             return this.nextScheduleTimeOverride;
                }

                public final int getNextScheduleTimeOverrideGeneration() {
/* 1 */             return this.nextScheduleTimeOverrideGeneration;
                }

                public final int getPeriodCount() {
/* 1 */             return this.periodCount;
                }

                public final int getStopReason() {
/* 1 */             return this.stopReason;
                }

                public final String getTraceTag() {
/* 1 */             return this.traceTag;
                }

                public final boolean hasConstraints() {
/* 9 */             return !O0000Ioio00.I0000O(IOo0o10i1IO.I000OiO, this.constraints);
                }

                public int hashCode() {
/* 150 */           int iI0000O = IIl001iO0Io.I0000O(this.stopReason, IIl001iO0Io.I0000O(this.nextScheduleTimeOverrideGeneration, IIlIOloOOO.I0000O(this.nextScheduleTimeOverride, IIl001iO0Io.I0000O(this.generation, IIl001iO0Io.I0000O(this.periodCount, (this.outOfQuotaPolicy.hashCode() + Oi010OO0.I000OOo1O(IIlIOloOOO.I0000O(this.scheduleRequestedAt, IIlIOloOOO.I0000O(this.minimumRetentionDuration, IIlIOloOOO.I0000O(this.lastEnqueueTime, IIlIOloOOO.I0000O(this.backoffDelayDuration, (this.backoffPolicy.hashCode() + IIl001iO0Io.I0000O(this.runAttemptCount, (this.constraints.hashCode() + IIlIOloOOO.I0000O(this.flexDuration, IIlIOloOOO.I0000O(this.intervalDuration, IIlIOloOOO.I0000O(this.initialDelay, (this.output.hashCode() + ((this.input.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((this.state.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.workerClassName), 31, this.inputMergerClassName)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31, this.expedited)) * 31, 31), 31), 31), 31), 31);
/* 154 */           String str = this.traceTag;
/* 166 */           int iHashCode = (iI0000O + (str == null ? 0 : str.hashCode())) * 31;
/* 167 */           Boolean bool = this.backOffOnSystemInterruptions;
/* 176 */           return iHashCode + (bool != null ? bool.hashCode() : 0);
                }

                public final boolean isBackedOff() {
                    return this.state == i01IOiO1lO.I00iOIl && this.runAttemptCount > 0;
                }

                public final boolean isPeriodic() {
                    return this.intervalDuration != 0;
                }

                public final void setBackOffOnSystemInterruptions(Boolean bool) {
/* 1 */             this.backOffOnSystemInterruptions = bool;
                }

                public final void setBackoffDelayDuration(long backoffDelayDuration) {
/* 6 */             if (backoffDelayDuration > 18000000) {
/* 16 */                IIi0oIl.I000II().I000l1(TAG, "Backoff delay duration exceeds maximum value");
                    }
/* 23 */            if (backoffDelayDuration < 10000) {
/* 33 */                IIi0oIl.I000II().I000l1(TAG, "Backoff delay duration less than minimum value");
                    }
/* 46 */            this.backoffDelayDuration = lIiioliIlo.I0000O(backoffDelayDuration, 10000L, 18000000L);
                }

                public final void setNextScheduleTimeOverride(long j) {
/* 1 */             this.nextScheduleTimeOverride = j;
                }

                public final void setNextScheduleTimeOverrideGeneration(int i) {
/* 1 */             this.nextScheduleTimeOverrideGeneration = i;
                }

                public final void setPeriodCount(int i) {
/* 1 */             this.periodCount = i;
                }

                public final void setPeriodic(long intervalDuration, long flexDuration) {
/* 6 */             if (intervalDuration < 900000) {
/* 16 */                IIi0oIl.I000II().I000l1(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
                    }
/* 23 */            this.intervalDuration = intervalDuration >= 900000 ? intervalDuration : 900000L;
/* 30 */            if (flexDuration < 300000) {
/* 40 */                IIi0oIl.I000II().I000l1(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
                    }
/* 47 */            if (flexDuration > this.intervalDuration) {
/* 69 */                IIi0oIl.I000II().I000l1(TAG, "Flex duration greater than interval duration; Changed to " + intervalDuration);
                    }
/* 82 */            this.flexDuration = lIiioliIlo.I0000O(flexDuration, 300000L, this.intervalDuration);
                }

                public final void setTraceTag(String str) {
/* 1 */             this.traceTag = str;
                }

                public String toString() {
/* 12 */            return IlIi0I0.I000oI1ioi(new StringBuilder("{WorkSpec: "), this.id, '}');
                }

/* 9 */         public WorkSpec(String str, i01IOiO1lO i01ioio1lo, String str2, String str3, Ii11I1OOII1 ii11I1OOII1, Ii11I1OOII1 ii11I1OOII12, long j, long j2, long j3, IOo0o10i1IO iOo0o10i1IO, int i, I1o1O1Ii1l0l i1o1O1Ii1l0l, long j4, long j5, long j6, long j7, boolean z, OIio0Ii1Ii oIio0Ii1Ii, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
/* 11 */            this.id = str;
/* 12 */            this.state = i01ioio1lo;
/* 13 */            this.workerClassName = str2;
/* 14 */            this.inputMergerClassName = str3;
/* 15 */            this.input = ii11I1OOII1;
/* 16 */            this.output = ii11I1OOII12;
/* 17 */            this.initialDelay = j;
/* 18 */            this.intervalDuration = j2;
/* 19 */            this.flexDuration = j3;
/* 20 */            this.constraints = iOo0o10i1IO;
/* 21 */            this.runAttemptCount = i;
/* 22 */            this.backoffPolicy = i1o1O1Ii1l0l;
/* 23 */            this.backoffDelayDuration = j4;
/* 24 */            this.lastEnqueueTime = j5;
/* 25 */            this.minimumRetentionDuration = j6;
/* 26 */            this.scheduleRequestedAt = j7;
/* 27 */            this.expedited = z;
/* 28 */            this.outOfQuotaPolicy = oIio0Ii1Ii;
/* 29 */            this.periodCount = i2;
/* 30 */            this.generation = i3;
/* 31 */            this.nextScheduleTimeOverride = j8;
/* 32 */            this.nextScheduleTimeOverrideGeneration = i4;
/* 33 */            this.stopReason = i5;
/* 34 */            this.traceTag = str4;
/* 35 */            this.backOffOnSystemInterruptions = bool;
                }

/* 35 */        public WorkSpec(String str, String str2) {
/* 36 */            this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
                }

/* 36 */        public WorkSpec(String str, WorkSpec workSpec) {
/* 37 */            String str2 = workSpec.workerClassName;
/* 38 */            i01IOiO1lO i01ioio1lo = workSpec.state;
/* 39 */            String str3 = workSpec.inputMergerClassName;
/* 40 */            Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(workSpec.input);
/* 41 */            Ii11I1OOII1 ii11I1OOII12 = new Ii11I1OOII1(workSpec.output);
/* 42 */            long j = workSpec.initialDelay;
/* 43 */            long j2 = workSpec.intervalDuration;
/* 44 */            long j3 = workSpec.flexDuration;
                    IOo0o10i1IO iOo0o10i1IO = workSpec.constraints;
/* 46 */            IOo0o10i1IO iOo0o10i1IO2 = new IOo0o10i1IO();
/* 47 */            iOo0o10i1IO2.I0000Il00O = iOo0o10i1IO.I0000Il00O;
/* 48 */            iOo0o10i1IO2.I0000O = iOo0o10i1IO.I0000O;
/* 49 */            iOo0o10i1IO2.I00000oOI = iOo0o10i1IO.I00000oOI;
/* 50 */            iOo0o10i1IO2.I00000oIO = iOo0o10i1IO.I00000oIO;
/* 51 */            iOo0o10i1IO2.I0000oI00 = iOo0o10i1IO.I0000oI00;
/* 52 */            iOo0o10i1IO2.I0001Ioi1lo = iOo0o10i1IO.I0001Ioi1lo;
/* 53 */            iOo0o10i1IO2.I000OOo1O = iOo0o10i1IO.I000OOo1O;
/* 54 */            iOo0o10i1IO2.I000II = iOo0o10i1IO.I000II;
/* 55 */            iOo0o10i1IO2.I000O01llI0 = iOo0o10i1IO.I000O01llI0;
/* 70 */            this(str, i01ioio1lo, str2, str3, ii11I1OOII1, ii11I1OOII12, j, j2, j3, iOo0o10i1IO2, workSpec.runAttemptCount, workSpec.backoffPolicy, workSpec.backoffDelayDuration, workSpec.lastEnqueueTime, workSpec.minimumRetentionDuration, workSpec.scheduleRequestedAt, workSpec.expedited, workSpec.outOfQuotaPolicy, workSpec.periodCount, 0, workSpec.nextScheduleTimeOverride, workSpec.nextScheduleTimeOverrideGeneration, workSpec.stopReason, workSpec.traceTag, workSpec.backOffOnSystemInterruptions, 524288, null);
                }

/* 84 */        public final void setPeriodic(long intervalDuration) {
                    if (intervalDuration < 900000) {
/* 88 */                IIi0oIl.I000II().I000l1(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
                    }
                    long j = intervalDuration < 900000 ? 900000L : intervalDuration;
                    if (intervalDuration < 900000) {
                        intervalDuration = 900000;
                    }
/* 89 */            setPeriodic(j, intervalDuration);
                }
            }
