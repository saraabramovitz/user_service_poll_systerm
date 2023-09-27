package com.userServicePollSysterm.pollSystem;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "PollService",
        url = "${externalApi.pollService.url}"
)
public interface PollService {
    @DeleteMapping("/poolAnswer/deleteUserAnswers/{userId}")
    void deletePollAnswersByUserId(@PathVariable Long userId);


}
