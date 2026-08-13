            package p000;

            import androidx.work.OverwritingInputMerger;
            import com.google.mlkit.vision.pose.PoseLandmark;
            
            public final class O1loO1i0IoO extends O1loO1O1OO {
                public static final O1loO1i0IoO I0000O = new O1loO1i0IoO(11, 12, 0);
                public static final O1loO1i0IoO I0000oI00 = new O1loO1i0IoO(12, 13, 1);
                public static final O1loO1i0IoO I0001Ioi1lo = new O1loO1i0IoO(15, 16, 2);
                public static final O1loO1i0IoO I000II = new O1loO1i0IoO(16, 17, 3);
                public static final O1loO1i0IoO I000O01llI0 = new O1loO1i0IoO(1, 2, 4);
                public static final O1loO1i0IoO I000OOo1O = new O1loO1i0IoO(3, 4, 5);
                public static final O1loO1i0IoO I000OiO = new O1loO1i0IoO(4, 5, 6);
                public static final O1loO1i0IoO I000iOII = new O1loO1i0IoO(6, 7, 7);
                public static final O1loO1i0IoO I000l1 = new O1loO1i0IoO(7, 8, 8);
                public static final O1loO1i0IoO I000lI = new O1loO1i0IoO(8, 9, 9);
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1loO1i0IoO(int i, int i2, int i3) {
/* 3 */             super(i, i2);
/* 1 */             this.I0000Il00O = i3;
                }

                @Override
                public void I00000oIO(Olil0III olil0III) {
                    switch (this.I0000Il00O) {
                        case 14:
/* 78 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
/* 83 */                    lO0I0Io.I00000oIO(olil0III, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
/* 86 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE `WorkSpec`");
/* 89 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
/* 92 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
/* 97 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                            break;
                        case 15:
/* 53 */                    lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
/* 58 */                    lO0I0Io.I00000oIO(olil0III, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
/* 61 */                    lO0I0Io.I00000oIO(olil0III, "DROP TABLE `WorkSpec`");
/* 64 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
/* 67 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
/* 72 */                    lO0I0Io.I00000oIO(olil0III, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                            break;
                        case 16:
/* 42 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
/* 47 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                            break;
                        case 17:
/* 36 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 30 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 24 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 18 */                    lO0I0Io.I00000oIO(olil0III, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
                            break;
                        default:
/* 12 */                    super.I00000oIO(olil0III);
                            break;
                    }
                }

                @Override
                public void I00000oOI(Olil0l0 olil0l0) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 207 */                   olil0l0.I001IO000("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                            break;
                        case 1:
/* 196 */                   olil0l0.I001IO000("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
/* 201 */                   olil0l0.I001IO000("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                            break;
                        case 2:
/* 165 */                   olil0l0.I001IO000("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
/* 170 */                   olil0l0.I001IO000("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
/* 175 */                   olil0l0.I001IO000("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
/* 180 */                   olil0l0.I001IO000("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
/* 185 */                   olil0l0.I001IO000("DROP TABLE `SystemIdInfo`");
/* 190 */                   olil0l0.I001IO000("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                            break;
                        case 3:
/* 129 */                   olil0l0.I001IO000(OlOoOOooiIll.I0000Il00O("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
/* 134 */                   olil0l0.I001IO000("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
/* 139 */                   olil0l0.I001IO000("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
/* 144 */                   olil0l0.I001IO000("DROP TABLE `WorkSpec`");
/* 149 */                   olil0l0.I001IO000("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
/* 154 */                   olil0l0.I001IO000("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
/* 159 */                   olil0l0.I001IO000("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                            break;
                        case 4:
/* 81 */                    olil0l0.I001IO000("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
/* 86 */                    olil0l0.I001IO000("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
/* 91 */                    olil0l0.I001IO000("DROP TABLE IF EXISTS alarmInfo");
/* 96 */                    olil0l0.I001IO000("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                            break;
                        case 5:
/* 75 */                    olil0l0.I001IO000("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                            break;
                        case 6:
/* 64 */                    olil0l0.I001IO000("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
/* 69 */                    olil0l0.I001IO000("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                            break;
                        case 7:
/* 58 */                    olil0l0.I001IO000("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                            break;
                        case 8:
/* 52 */                    olil0l0.I001IO000("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                            break;
                        case 9:
/* 46 */                    olil0l0.I001IO000("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                            break;
                        case 10:
/* 40 */                    olil0l0.I001IO000("ALTER TABLE conversations ADD COLUMN systemPrompt TEXT NOT NULL DEFAULT ''");
                            break;
                        case 11:
/* 34 */                    olil0l0.I001IO000("ALTER TABLE messages ADD COLUMN imagePaths TEXT");
                            break;
                        case 12:
/* 18 */                    olil0l0.I001IO000("CREATE TABLE rag_documents (id TEXT PRIMARY KEY NOT NULL, title TEXT NOT NULL, uri TEXT NOT NULL, created_at INTEGER NOT NULL, chunk_count INTEGER NOT NULL)");
/* 23 */                    olil0l0.I001IO000("CREATE TABLE rag_chunks (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, document_id TEXT NOT NULL, ordinal INTEGER NOT NULL, text TEXT NOT NULL, embedding BLOB NOT NULL, FOREIGN KEY (document_id) REFERENCES rag_documents(id) ON DELETE CASCADE)");
/* 28 */                    olil0l0.I001IO000("CREATE INDEX index_rag_chunks_document_id ON rag_chunks(document_id)");
                            break;
                        case 13:
/* 12 */                    olil0l0.I001IO000("CREATE TABLE faces (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, name TEXT NOT NULL, embedding BLOB NOT NULL, thumbnail BLOB NOT NULL, created_at INTEGER NOT NULL)");
                            break;
                        default:
/* 6 */                     super.I00000oOI(olil0l0);
                            break;
                    }
                }
            }
